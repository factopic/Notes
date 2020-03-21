<%-- 
    Document   : VidyarthiDetails
    Created on : Jan 1, 2020, 2:55:17 PM
    Author     : Dee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="connect.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <!-- <form name="form1" ENCTYPE="multipart/form-data" action="VidyarthiDetails1.jsp" method="GET"> -->
        <form name="form1" ENCTYPE="multipart/form-data" action="VidyarthiDetails1.jsp" method="post" >
        <table>
            <tr><th>Details</th></tr>
           
            <tr> <td height="40"> RegNo </td> <td> <input type="text" name="text1" value=""></td> </tr>
            <tr> <td height="40"> Student Name </td> <td> <input type="text" name="text2" value=""></td> </tr>
            <tr> <td height="40"> Address </td> <td> <textarea  name="text3" rows="5" cols="20"></textarea></td> </tr>
            <tr> <td height="40"> Mobile No </td> <td> <input type="text" name="text4" value=""></td> </tr>
           
            <tr>
                <td>
                    <label>Photo</label>
                    <input type="file"  name="image" required><br>
                </td>
            </tr>
             <tr> <td height="40">  </td> <td align="center"> <input type="submit" value="Save"> <input type="reset" value="cancel"></td> </tr>       

             
        </table>
        </form>
        <a href="VidyarthiList.jsp">List</a>
    </body>
</html>
