// CollegeList.js
import { useEffect, useState } from 'react';
import axios from 'axios';
import { Box, Container, Typography } from '@mui/material';
import Grid from '@mui/material/Grid2';
import CollegeCard from './CollegeCard';

const CollegeList = () => {
  const [colleges, setColleges] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api/colleges')
      .then(response => {
        setColleges(response.data);
        console.log(response);
        
      })
      .catch(error => console.error(error));
  }, []);

  return (
    <Container>
      <Typography variant="h4" gutterBottom align="center">
        College List
      </Typography>
      <Box sx={{flexGrow:1}}>
      <Grid container spacing={3}>
        {colleges.map(college => (
          <Grid item xs={12} sm={6} md={4} key={college.id}>
            <CollegeCard college={college} />
          </Grid>
        ))}
      </Grid>
      </Box>
    </Container>
  );
};

export default CollegeList;
