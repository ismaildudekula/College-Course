// CollegeDetails.js
import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';
import { Container, Typography, Grid, Paper } from '@mui/material';

const CollegeDetails = () => {
  const { id } = useParams();
  const [college, setCollege] = useState(null);

  useEffect(() => {
    axios.get(`http://localhost:8080/api/colleges/${id}`)
      .then(response => setCollege(response.data))
      .catch(error => console.error(error));
  }, [id]);

  if (!college) {
    return <Typography>Loading...</Typography>;
  }

  return (
    <Container>
      <Typography variant="h4" gutterBottom>
        {college.name}
      </Typography>
      <Grid container spacing={2}>
        {college.courses?.map(course => (
          <Grid item xs={12} sm={6} key={course.id}>
            <Paper elevation={3} sx={{ padding: 2 }}>
              <Typography variant="h6">{course.name}</Typography>
              <Typography>Duration: {course.duration}</Typography>
              <Typography>Accommodation: {course.accommodationType}</Typography>
              <Typography>Course Fee: ${course.courseFee.feeAmount}</Typography>
              <Typography>Accommodation Fee: ${course.courseFee.accommodationFee}</Typography>
            </Paper>
          </Grid>
        ))}
      </Grid>
    </Container>
  );
};

export default CollegeDetails;
