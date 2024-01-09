
<%@ include file="common/header.jspf"%>
<title>Login Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	text-align: center;
}

.login-container {
	max-width: 300px;
	margin: 0 auto;
	background: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.login-container input {
	width: 100%;
	padding: 8px;
	margin-bottom: 15px;
	box-sizing: border-box;
}
</style>
</head>
<body>
	<%@ include file="common/navigation.jspf"%>
	<div class="container">
		<div class="login-container">
			<h2>New Todo</h2>
			<form:form method="post" modelAttribute="todo">
				<fieldset class="mb-3">
					<form:label path="description">Description:</form:label>
					<form:input type="text" path="description" required="required" />
					<form:errors path="description" cssClass="text-warning" />
				</fieldset>

				<fieldset class="mb-3">
					<form:label path="targetDate">Target Date:</form:label>
					<form:input type="text" path="targetDate" required="required" />
					<form:errors path="targetDate" cssClass="text-warning" />
				</fieldset>


				<form:input type="hidden" path="id" />

				<form:input type="hidden" path="isDone" />

				<button type="submit" class="btn btn-success">Submit</button>
			</form:form>
		</div>
	</div>

	<%@ include file="common/footer.jspf"%>

	<script type="text/javascript">
		$('#targetDate').datepicker({
			format : 'yyyy-mm-dd',
		});
	</script>