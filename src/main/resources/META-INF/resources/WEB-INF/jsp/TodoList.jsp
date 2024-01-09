<%@ include file="common/header.jspf"%>


<title>My Todos</title>

</head>
<body>
	<%@ include file="common/navigation.jspf"%>

	<div class="container">
		<h2 class="heading">Todo List</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Username</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.username}</td>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.isDone}</td>
						<td><a href="update-todo?id=${todo.id}"
							class="btn btn-success" />Update</td>
						<td><a href="delete-todo?id=${todo.id}"
							class="btn btn-warning" />Delete</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-todo" class="btn btn-success">Add Todo</a>
	</div>
	<%@ include file="common/footer.jspf"%>