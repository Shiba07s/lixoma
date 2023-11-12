<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Training Application Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            color: #007bff;
            margin: 20px 0;
        }

        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
            color: #007bff;
        }

        input[type="text"],
        input[type="email"],
        input[type="tel"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="radio"] {
            margin-right: 10px;
        }

        button {
            display: block;
            width: 100%;
            padding: 8px 15px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-top: 10px;
        }

        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h2>Training Application Form</h2>
    <form action="submit_application" method="post">
        <div>
            <label for="treasuryId">TREASURY ID:</label>
            <input type="text" id="treasuryId" name="treasuryId" required>
        </div>
        <div>
            <label for="participantName">Participant Name:</label>
            <input type="text" id="participantName" name="participantName" required>
        </div>
        <div>
            <label for="schoolComplexId">School Complex ID:</label>
            <input type="text" id="schoolComplexId" name="schoolComplexId" required>
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div>
            <label for="mobile">Mobile:</label>
            <input type="tel" id="mobile" name="mobile" required>
        </div>
        <div>
            <label for="trainingBefore">Have you attended any training before?</label>
            <input type="radio" id="trainingBeforeYes" name="trainingBefore" value="yes">
            <label for="trainingBeforeYes">Yes</label>
            <input type="radio" id="trainingBeforeNo" name="trainingBefore" value="no">
            <label for="trainingBeforeNo">No</label>
        </div>
        <div>
            <label for="trainingName">Training Name:</label>
            <input type="text" id="trainingName" name="trainingName">
        </div>
        <div>
            <button type="submit">Submit Application</button>
        </div>
    </form>
</body>
</html>
