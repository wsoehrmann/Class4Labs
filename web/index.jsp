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
            
                function validateRect(){
                    if(length == null || length < 0){
                        alert("Please enter a valid number");
                        return false;
                    }
                    else if (width == null || width < 0){
                        alert("Please enter a valid number");
                        return false
                    }else{
                        return true;
                    }
                    
                    
            </script>
    </head>
    <body>
        <h1>Enter the length and width of the rectangle</h1>
        <form  id="rectform" name="rectForm" method="POST "action="AreaController" onsubmit="return validateRect()">  


            length:<input type="text" name="length"><br>
            width:<input type="text" name="width">
            
            <input type="submit" value="Submit" />


        </form>

        <p>Answer: 
            <%
                Object objRectangle = request.getAttribute("rectAnswer");
                String rectAnswer = "";
                if (objRectangle != null) {
                    rectAnswer = objRectangle.toString();

                    out.print(rectAnswer);
                }
            %>

        </p>
        <h1>Enter radius of circle</h1>
        
        <script type="text/javascript">
            
            
                        function validateCircle(){
                            if(radius == null || length < 0){
                                alert ("Please enter a valid number");
                            return false;
                            }else{
                                return true;
                            }
                        }
            </script>
        
        
        
        <form  id="raidform" name="raidForm" method="POST"action="RadiusController" onsubmit="return validateCircle()"     >  

            radius:<input type="text"name= "radius">
            
            <input type="submit" value="Submit" />


        </form>
        <p>See Answer above: 
            <%
                Object objCircle = request.getAttribute("circleAnswer");
                String circleAnswer = "";
                if (objCircle!= null) {
                    circleAnswer = objCircle.toString();

                    out.print(circleAnswer);
                   
                }
            %>

        </p>

        <h1>Enter First and second legs of a triangle</h1>
        <script type="text/javacript">
                    
                    function validateFirstTwoLegs(){
                    if (firstleg == null || length < 0){
                    alert ("Please enter a valid number");
                    return false;
                    }{else if (secondleg == null || length < 0){
                    alert ("Please enter a valid number");
                    return false;
                    }else{
                    return true:
                    }
                    
                </script>
        
            <form  id="triangform" name="triangForm" method="POST"action="TriangleController"nsubmit="return validateFirstTwoLegs()" >
                firstleg :<input type="text" name="firstleg"><br>
                secondleg :<input type="text"name="secondleg">
                
                <input type="submit" value="Submit" />


            </form>
            <p>See answer above:
                <%
                    Object objTriangle = request.getAttribute("thirdleg");
                    String thirdleg = "";
                    if (objTriangle != null) {
                        thirdleg = objTriangle.toString();

                        out.print(thirdleg);
                    }
                %>

            </p>

            </body>
            </html>
