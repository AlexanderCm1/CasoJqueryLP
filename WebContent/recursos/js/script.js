$(document).ready(function(){
  console.log("hola soy jquery");
  $.get("SA",function(response){
    let a = JSON.parse(response);
    console.log(JSON.parse(response));
    a.forEach((element,index) => {
      $("#lista").append("<tr><th scope='row'>"+element.alumno_id+"<td>"+element.nombrecat+"</td>"+"<td>"+element.apelnombres+"</td>"+"<td>"+element.correo+"</td>"+
    "<td>"+element.telefono+"</td></tr>");
      console.log(element.nombrecat);
    });
  $.get("SE",function(response){
    let a = JSON.parse(response);
    a.forEach((e,i) =>{
      $("#cat").append("<option>"+e.escuela_id+" "+ e.nombrecat + "</option>");

    });
  });

  });
  /*
  $("#tablita tbody").append("<tr><td style='color:blue'>"+c+"</td><td>"+d[i].nom_categoria+"</td><td>"+d[i].nom_producto+"</td><td>"+d[i].precio+"</td><td>"+d[i].cantidad+
  "</td><td><a href='#' style='color:green' onclick='modificar("+d[i].idproducto+")'><i class='far fa-edit'></i></a></td><td><a href='#' style='color:red' onclick='eliminar("+d[i].idproducto+")'><i class='far fa-trash-alt'></i></a></td></tr>")
  */
});
