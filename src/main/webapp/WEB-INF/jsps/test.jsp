<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Page</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        function search() {
            // Get the value from the search input field
            var searchTerm = document.getElementById("searchInput").value;
 
            // Make an AJAX request to the API
            $.ajax({
                type: "GET",
                url: "/api/schedule?ref_planner_id=" + searchTerm, // Replace with your API endpoint
                dataType: "json", // Specify that the response is JSON
                success: function(response) {
                    // Extract and display tmonth and tyear from the response
                    var tmonth = response[0].tmonth;
                    var tyear = response[0].tyear;
                    var tyear = response[0].tyear;
                    var tyear = response[0].tyear;
                    var tyear = response[0].tyear;
                    var tyear = response[0].tyear;
 
                    // Display tmonth and tyear in the specified divs
                    document.getElementById("tmonth").textContent = "Training Month: " + tmonth;
                    document.getElementById("tyear").textContent = "Training Year: " + tyear;
                },
                error: function(error) {
                    console.log("Error:", error);
                }
            });
        }
    </script>
</head>
<body>
    <h1>Search Page</h1>
    <input type="text" id="searchInput" placeholder="Enter Training ReferenceId">
    <button onclick="search()">Search</button>
 
    <div id="tmonth">
        <!-- Training Month will be displayed here -->
    </div>
 
    <div id="tyear">
        <!-- Training Year will be displayed here -->
    </div>
</body>
</html>