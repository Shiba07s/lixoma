<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Training Support System</title>
<link rel="stylesheet" href="path-to-bootstrap.min.css">
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
    <form action="save" method="post">
                <div class="form-group">
                <label for="trainingReferenceId">Training ReferenceId:</label>
                <input type="text" class="form-control" id="trainingReferenceId" name="trainingReferenceId" placeholder="Enter Training ReferenceId..." required>
            </div>
              <div class="form-group">
                <button type="button" class="btn btn-primary" id="searchButton">Search</button>
            </div>

            <div class="form-group">
                <label for="venue">Venue:</label>
                <input type="text" class="form-control" id="venue" name="venue" placeholder="Enter Venue..." required>
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
    <label for="mapLocation">Map Location:</label>
    <input type="text" id="mapLocation" name="mapLocation" placeholder="Enter Map Location..." required>
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
    <label for="coordinatorName">Coordinator Name:</label>
    <input type="text" id="coordinatorName" name="coordinatorName" placeholder="Enter Coordinator Name..." required>
</div>

<div class="form-group">
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" placeholder="Enter Email..." required>
</div>

<div class="form-group">
    <label for="mobile">Mobile:</label>
    <input type="tel" id="mobile" name="mobile" placeholder="Enter Mobile..." required>
</div>

<div class="form-group">
    <label for="state">State:</label>
    <input type="text" id="state" name="state" placeholder="Enter State..." required>
</div>

<div class="form-group">
    <label for="district">District:</label>
    <input type="text" id="district" name="district" placeholder="Enter District..." required>
</div>

<div class="form-group">
    <label for="mandal">Mandal:</label>
    <input type="text" id="mandal" name="mandal" placeholder="Enter Mandal..." required>
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
        <button type="submit" value="save">SCHEDULE</button>
      </div>
    </form>
  </div>

   ${msg}
</body>
</html>