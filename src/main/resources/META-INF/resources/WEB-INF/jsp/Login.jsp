<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            padding: 50px;
        }
        .login-container {
            max-width: 300px;
            margin: 0 auto;
            background: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .login-container label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
        .login-container input {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            box-sizing: border-box;
        }
        .login-container button {
            background-color: #4caf50;
            color: #fff;
            padding: 10px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
    </style>
</head>
<body>
	<div class="container">
		<pre>${errorMessage}</pre>
		<div class="login-container">
			<h2>Login</h2>
			<form method="post">
				<label for="username">Username:</label> <input type="text"
					id="username" name="username" required> <label
					for="password">Password:</label> <input type="password"
					id="password" name="password" required>

				<button type="submit">Login</button>
			</form>
		</div>

	</div>
</body>
</html>
