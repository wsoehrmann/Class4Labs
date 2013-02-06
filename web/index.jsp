<%-- 
    Document   : index
    Created on : Feb 4, 2013, 9:18:48 AM
    Author     : Wesley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>This is the lab to calculate the area of a rectangle,
            the radius of a circle or the third leg of a triangle</title>
        <script type="text/javascript">
            
            
          
            
        </script>
    </head>
    <body>
        <h1>Enter the length and width of the rectangle</h1>
        <form action="AreaController">  


            length:<input type="text" name="length"><br>
            width:<input type="text" name="width">
            <script type="text/javascript">
            
                function getArea(){
                    if(length == null || length < 0){
                        alert("Please enter a valid number");
                    }
                    else if (width == null || width < 0){
                        alert("Please enter a valid number");
                    }else{
                        return area;
            </script>
            <input type="submit" value="Submit" />


        </form>

        <p>Answer: 
            <%
                Object objRectangle = request.getAttribute("answer");
                String answer = "";
                if (objRectangle != null) {
                    answer = objRectangle.toString();

                    out.print(answer);
                }
            %>

        </p>
        <h1>Enter radius of circle</h>
        <form action="RadiusController">  

            radius:<input type="text"name= "radius">
            <script type="text/javascript">
            
            
                        function getAreaOfCircle(){
                            if(radius == null || length < 0){
                                alert ("Please enter a valid number");
                            
                            }else{
                                return areaOfCircle;
                            }
                        }
            </script>
            <input type="submit" value="Submit" />


        </form>
        <p>Answer: 
            <%
                Object objCircle = request.getAttribute("area");
                String area = "";
                if (objCircle!= null) {
                    answer = objCircle.toString();

                    out.print(answer);
                    System.out.println("answer =" + answer);
                }
            %>

        </p>

        <h1>Enter First and second legs of a triangle</h>
            <form>
                Firstleg :<input type="text" name="firstleg"><br>
                Secondleg :<input type="text"name="secondleg">
                <script type="text/javacript">
                    function getThirdleg(){
                    if (firstleg == null || length < 0){
                    alert ("Please enter a valid number");
                    }{else if (secondleg == null || length < 0){
                    alert ("Please enter a valid number");
                    }else{
                    return thirdleg:
                    }

                </script>
                <input type="submit" value="Submit" />


            </form>
            <p>Answer: 
                <%
                    Object objTriangle = request.getAttribute("thirdleg");
                    String thirdleg = "";
                    if (objTriangle != null) {
                        answer = objTriangle.toString();

                        out.print(thirdleg);
                    }
                %>

            </p>

            </body>
            </html>
