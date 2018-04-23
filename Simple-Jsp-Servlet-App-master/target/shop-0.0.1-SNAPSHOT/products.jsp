<h3>Available offerings:</h3>


 <form action="home" method="post">
 
<c:forEach var="i" begin="0" end="${products.size() - 1}">

	<c:set var="product" scope="page" value="${products.get(i)}"/>  
	  
   	<p>
   	   	<b>${product.id}</b>
   		<b>${product.label}</b>
   		<button type = "submit" name= "selections" value="${products.get(i).getId()}" >Add</button>
   		<br/>
   		<b>${product.description}</b> 
         </p>
   	
</c:forEach>  

 </br></br></br>
<a href="<c:url value="/cart" />" > <input type="button" value="View The Shopping cart" /></a>
</br></br></br>
<a href="<c:url value="/FirstPage" />" > <input type="button" value="Go Back To Main Page" /></a>
</a>
</form>

