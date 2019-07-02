<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Customer information</h1>
        <p>Customer Name: ${customer.name}</p>
        <p>Cusotmer Address: <br/>
            ${customer.officeAddress.address1}<br/>
            ${customer.officeAddress.address2}<br/>
            ${customer.officeAddress.city}<br/>
            ${customer.officeAddress.region}<br/>
            ${customer.officeAddress.postcode}<br/>
        </p>
        <p>Customer Bill Adress:<br/>
            ${customer.billingAddress.address1}<br/>
            ${customer.billingAddress.address2}<br/>
            ${customer.billingAddress.city}<br/>
            ${customer.billingAddress.region}<br/>
            ${customer.billingAddress.postcode}<br/> 
        </p>
           <p>Customer delivery Adress:<br/>
            ${customer.deliveryAddress.address1}<br/>
            ${customer.deliveryAddress.address2}<br/>
            ${customer.deliveryAddress.city}<br/>
            ${customer.deliveryAddress.region}<br/>
            ${customer.deliveryAddress.postcode}<br/> 
        </p>
        
            </body>
</html>
