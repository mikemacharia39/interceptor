# spring boot interceptor

## purpose

This application explores the use of filter and interceptor

Filters
-------

Based on a sequence of events, filters are executed first.
Filter is much more versatile than the postHandle. You can change the request or response and pass it to the chain or even block the request processing.


Interceptors
------------

Spring Interceptors are similar to Servlet Filters, but they act in Spring Context so are powerful to manage HTTP Request and Response but they can implement more sophisticated behaviour because can access all Spring context.


<table>
   <tr>
      <th>Interceptor/Filter perspective</th>
   </tr>
   <tr>
      <td><img src="https://i.stack.imgur.com/9iCub.png"></td>
   </tr>
</table>

