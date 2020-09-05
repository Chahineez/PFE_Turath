// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';

// Pie Chart Example


var nbArchitectes= document.getElementById("nbArchitectes").value;
var nbExperts=document.getElementById("nbExperts").value;
var nbAdmins=document.getElementById("nbAdmins").value;


var ctx = document.getElementById("myPieChartActors");

var myPieChart = new Chart(ctx, {
  type: 'pie',
  data: {
	   labels: ["Admins", "Experts", "Architectes"],
    datasets: [{
      data: [nbAdmins, nbExperts, nbArchitectes],
      backgroundColor: ['#28a745','#ffc107', '#007bff'],
    }],
  },
});
 