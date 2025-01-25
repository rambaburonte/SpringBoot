<%@ page isELIgnored="false" %>
<style>
#ele{
     margin: auto; 
    background-color: #70CBBF;
    border: 2px solid black;
    align-content: center;
    width: 500px;
    color: black;
    height: 500px;
    padding: 20px; /* Added padding for better spacing */
    display: flex; /* Added flex for centering */
    flex-direction: column; /* Align items vertically */
    justify-content: center; /* Center items vertically */
    align-items: center; /* Center items horizontally */
}
h1{
    color: navy;
    text-align: center; /* Center align the heading */
}

a{
    align-self: center;
    border: 2px solid maroon;
    width: 45%;
    height: 10%;
    text-align: center; /* Center align the text inside links */
    line-height: 2.5; /* Vertically center align the text */
    background-color: #fff; /* Added background color for contrast */
    text-decoration: none; /* Remove underline from links */
    color: maroon; /* Link text color */
    margin: 10px 0; /* Spacing between links */
    display: flex; /* Flex for centering text */
    justify-content: center; /* Center text horizontally */
    align-items: center; /* Center text vertically */
}
a:hover {
    background-color: #FFC0CB; /* Light pink background on hover */
    color: navy; /* Change text color on hover */
}
</style>

<h1>Welcome To Spring MVC</h1>
<div id="ele">
    <a href="colors">Show All Colors</a></br></br>
    <a href="friends">Show All Friends</a></br></br>
    <a href="phones">Show All Phones</a></br></br>
    <a href="ids">Show All Id Details</a></br></br>
</div>
