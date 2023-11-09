<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Teacher Training Support System</title>
      <link rel="stylesheet" href="path-to-bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    
    <script>
    $(document).ready(function () {
        // Function to handle the "SCHEDULE" button click
        $("#scheduleButton").click(function () {
            // Gather data from the form fields
            
            var trainingMode = $("#trainingMode").val();
            var trainingMonth = $("#trainingMonth").val();
            var trainingYear = $("#trainingYear").val();
            var trainingName = $("#trainingName").val();
            var module = $("#module").val();
            var description = $("#description").val();
            var grade = $("#grade").val();
            var agency = $("#agency").val();
            var appStartDate = $("#appStartDate").val();
            var appEndDate = $("#appEndDate").val();
            var trainingStartDate = $("#trainingStartDate").val();
            var trainingEndDate = $("#trainingEndDate").val();
 
            // Create a URL-encoded form data string
            var formData =
                'tmode=' + encodeURIComponent(trainingMode) +
                '&tmonth=' + encodeURIComponent(trainingMonth) +
                '&tyear=' + encodeURIComponent(trainingYear) +
                '&tname=' + encodeURIComponent(trainingName) +
                '&tmodule=' + encodeURIComponent(module) +
                '&tdescription=' + encodeURIComponent(description) +
                '&tgrade=' + encodeURIComponent(grade) +
                '&tagency=' + encodeURIComponent(agency) +
                '&training_reg_start_dt=' + encodeURIComponent(appStartDate) +
                '&training_reg_end_dt=' + encodeURIComponent(appEndDate) +
                '&actual_start_dt=' + encodeURIComponent(trainingStartDate) +
                '&actual_end_dt=' + encodeURIComponent(trainingEndDate);
            
            var jsonString = JSON.stringify(formData);
 
            
            console.log(formData);
 
            // Make a POST request to the API
            fetch('/api/save', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: jsonString
            })
            .then(response => response.json())
            .then(data => {
                // Handle the response
                console.log("Schedule API response:", data);
            })
            .catch(error => {
                console.log("Error:", error);
                // Handle errors
            });
        });
    });
    $(document).ready(function () {
        $("#searchButton").click(function () {
            var searchTerm = $("#trainingReferenceId").val();

            $.ajax({
                type: "GET",
                url: "/api/schedule?ref_planner_id=" + searchTerm,
                dataType: "json",
                success: function (response) {
                    var tmonth = response[0].tmonth;
                    var tyear = response[0].tyear;
                    var tname = response[0].tname;
                    var tdescription = response[0].tdescription;
                    var training_reg_start_dt = response[0].training_reg_start_dt;
                    var training_reg_end_dt = response[0].training_reg_end_dt;
                    var actual_start_dt = response[0].actual_start_dt;
                    var actual_end_dt = response[0].actual_end_dt;
                    var venue_id = response[0].venue_id;
                    var tmode = response[0].tmode;
                    var tmodule = response[0].tmodule;
                    var tgrade = response[0].tgrade;
                    var tagency = response[0].tagency;

                    training_reg_start_dt = formatDate(training_reg_start_dt);
                    training_reg_end_dt = formatDate(training_reg_end_dt);
                    actual_start_dt = formatDate(actual_start_dt);
                    actual_end_dt = formatDate(actual_end_dt);

                    $("#trainingMonth").val(tmonth);
                    $("#trainingYear").val(tyear);
                    $("#trainingName").val(tname);
                    $("#description").val(tdescription);
                    $("#appStartDate").val(training_reg_start_dt);
                    $("#appEndDate").val(training_reg_end_dt);
                    $("#trainingStartDate").val(actual_start_dt);
                    $("#trainingEndDate").val(actual_end_dt);
                    $("#venueId").val(venue_id);
                    $("#trainingMode").val(tmode);
                    $("#module").val(tmodule);
                    $("#grade").val(tgrade);
                    $("#agency").val(tagency);
                },
                error: function (error) {
                    console.log("Error:", error);
                }
            });
        });
    });

    function formatDate(inputDate) {
        var date = new Date(inputDate);
        var year = date.getFullYear();
        var month = String(date.getMonth() + 1).padStart(2, '0');
        var day = String(date.getDate()).padStart(2, '0');
        return year + "-" + month + "-" + day;
    }
    
</script>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            margin: 0;
            padding: 0;
        }

        .container {
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin: 30px auto;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 80%;
            max-width: 700px;
        }

        h2 {
            text-align: center;
            color: #007bff;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        label {
            font-weight: bold;
        }

        input[type="text"],
        input[type="email"],
        input[type="tel"],
        input[type="date"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        button[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            padding: 10px 20px;
            width: 100%;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>TEACHER TRAINING SUPPORT SYSTEM</h2>
        
        <form action="/api/save" method="post" id="scheduleButton">
            <div class="form-group">
                <label for="trainingReferenceId">Training ReferenceId:</label>
                <input type="text" class="form-control" id="trainingReferenceId" name="trainingReferenceId" placeholder="Enter Training ReferenceId..." required>
            </div>
            <div class="form-group">
                <button type="button" class="btn btn-primary" id="searchButton">Search</button>
            </div>
 
            <div class="form-group">
                <label for="trainingMode">Training Mode:</label>
                <input type="text" id="trainingMode" name="trainingMode" placeholder="Enter Training Mode..." required>
            </div>

            <div class="form-group">
                <label for="trainingMonth">Training Month:</label>
                <input type="text" id="trainingMonth" name="trainingMonth" placeholder="Enter Training Month..." required>
            </div>

            <div class="form-group">
                <label for="trainingYear">Training Year:</label>
                <input type="text" id="trainingYear" name="trainingYear" placeholder="Enter Training Year..." required>
            </div>

            <div class="form-group">
                <label for="trainingName">Training Name:</label>
                <input type="text" id="trainingName" name="trainingName" placeholder="Enter Training Name..." required>
            </div>

            <div class="form-group">
                <label for="module">Module:</label>
                <input type="text" id="module" name="module" placeholder="Enter Module..." required>
            </div>

            <div class="form-group">
                <label for="description">Description:</label>
                <input type="text" id="description" name="description" placeholder="Enter Description..." required>
            </div>
 
            <div class="form-group">
                <label for="grade">Grade:</label>
                <input type="text" id="grade" name="grade" placeholder="Enter Grade..." required>
            </div>

            <div class="form-group">
                <label for="agency">Agency:</label>
                <input type="text" id="agency" name="agency" placeholder="Enter Agency..." required>
            </div>
            <div class="form-group">
                <label for="appStartDate">Application Start Date:</label>
                <input type="date" id="appStartDate" name="appStartDate" required>
            </div>

            <div class="form-group">
                <label for="appEndDate">Application End Date:</label>
                <input type="date" id="appEndDate" name="appEndDate" required>
            </div>
            <div class="form-group">
                <label for="trainingEndDate">Training Start Date:</label>
                <input type="date" id="trainingStartDate" name="trainingStartDate" required>
            </div>
            <div class="form-group">
                <label for="trainingEndDate">Training End Date:</label>
                <input type="date" id="trainingEndDate" name="trainingEndDate" required>
            </div>
            <div class="form-group">
                <button type="submit" value="/api/save">SCHEDULE</button>
            </div>
        </form>
    </div>

    ${msg}
</body>
</html>