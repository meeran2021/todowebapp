<%@ include file="common/header.jspf"%>

<title>Welcome</title>
</head>
<body>
	<%@ include file="common/navigation.jspf"%>

	<div class="container mt-5">
		<h2>Welcome '${username}'!!</h2>
		<h4>Click on <a href="todo-list">manage my todos</a> to manage your todos.</h4>
	</div>
	<%@ include file="common/footer.jspf"%>