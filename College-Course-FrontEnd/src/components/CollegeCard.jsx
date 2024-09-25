// CollegeCard.js
// import React from 'react';
import { Card, CardContent, Typography, Button, CardActions } from '@mui/material';
import { useNavigate } from 'react-router-dom';

const CollegeCard = ({ college }) => {
  const navigate = useNavigate();

  const handleViewDetails = () => {
    navigate(`/college/${college.id}`);
  };

  return (
    <Card sx={{ maxWidth: 345, boxShadow: 3 }}>
      <CardContent>
        <Typography variant="h5" component="div">
          {college.name}
        </Typography>
        <Typography variant="body2" color="text.secondary">
          Courses Offered: {college.courses.length}
        </Typography>
      </CardContent>
      <CardActions>
        <Button size="small" variant="contained" color="primary" onClick={handleViewDetails}>
          View Details
        </Button>
      </CardActions>
    </Card>
  );
};

export default CollegeCard;
