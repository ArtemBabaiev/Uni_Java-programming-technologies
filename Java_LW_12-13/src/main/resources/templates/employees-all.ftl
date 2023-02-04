<#import "/spring.ftl" as spring>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <div>
        <table class="table table-bordered table-primary table-striped table-hover caption-top">
            <caption>Table of Employees</caption>
            <thead  class="table-dark" >
            <tr>
                <th>id</th>
                <th>name</th>
                <th>description</th>
                <th>created at</th>
                <th>updated at</th>
                <th>update</th>
                <th>delete</th>
            </tr>
            </thead>
            <tbody>
                <#list employees as employee>
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.name}</td>
                        <td>${employee.description}</td>
                        <td>${employee.createdAt}</td>
                        <td>${(employee.updatedAt)!"hasn't been updated"}</td>
                        <td>
                            <form action="/ui/v1/employees/edit/${employee.id}">
                                <input type="submit" value="update" class="btn btn-warning btn-sm">
                            </form>
                        </td>
                        <td>
                            <form action="/ui/v1/employees/delete/${employee.id}" >
                                <input type="submit" value="delete" class="btn btn-danger btn-sm">
                            </form>
                        </td>

                    </tr>
                </#list>
            </tbody>


        </table>

        <a  href="/ui/v1/employees">Create </a>
    </div>

</body>
</html>