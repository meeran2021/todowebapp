<%@ include file="common/header.jspf"%>

<title>Welcome</title>
</head>
<body>
	<%@ include file="common/navigation.jspf"%>

	<div class="container">
		<h2>Welcome!!</h2>
		<h4>Your username is '${username}'</h4>
		<div>
			<a href="todo-list">Manage</a> your todos.
		</div>
	</div>
	<%@ include file="common/footer.jspf"%>