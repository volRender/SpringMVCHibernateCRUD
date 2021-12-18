<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>All Employees list!</h2>

<table>

    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>

    <c:forEach var = "emp" items="${allEmps}">

        <c:url var="empHref" value="/updateInfo">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <c:url var="empHrefDel" value="/deleteEmp">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <tr>
        <td>${emp.name}</td>
        <td>${emp.surname}</td>
        <td>${emp.department}</td>
        <td>${emp.salary}</td>
        <td>
            <input type="button" value="Update" onclick="window.location.href = '${empHref}'">
            <input type="button" value="Delete" onclick="window.location.href = '${empHrefDel}'">
        </td>


    </tr>
    </c:forEach>

</table>
<br>
<input type="button" value="Add" onclick="window.location.href = 'addEmp'">

</body>

</html>