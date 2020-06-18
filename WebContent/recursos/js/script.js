$(document).ready(function(){
  console.log("hellow world");
  console.log("hice cambiosx320");
  //modificar(id);



  $.get("SA",{opc:"1"},function(response){
    let a = JSON.parse(response);
    console.log(JSON.parse(response));
    a.forEach((element,index) => {
      $("#lista").append("<tr><th scope='row'>"+(index+1)+"<td>"+element.nombrecat+"</td>"+"<td>"+element.apelnombres+"</td>"+"<td>"+element.correo+"</td>"+
    "<td>"+element.telefono+"</td>  <td><a href='#' style='color:green' onclick='modificar("+element.alumno_id+")'><i class='fa fa-pencil' aria-hidden='true'></i></a></td> <td><a href='#' style='color:red' onclick='eliminar("+element.alumno_id+")' ><i class='fa fa-trash' aria-hidden='true'></i></a></td></tr>");
      console.log(element.nombrecat);
    });


});
$.get("SE",function(response){
  let a = JSON.parse(response);
  a.forEach((e,i) =>{
    $("#cat").append("<option  value='" + e.escuela_id +"'>"+e.escuela_id+" "+ e.nombrecat + "</option>");

  });
});
//enviar datos




  //metodo post




  /*
  $("#tablita tbody").append("<tr><td style='color:blue'>"+c+"</td><td>"+d[i].nom_categoria+"</td><td>"+d[i].nom_producto+"</td><td>"+d[i].precio+"</td><td>"+d[i].cantidad+
  "</td><td><a href='#' style='color:green' onclick='modificar("+d[i].idproducto+")'><i class='far fa-edit'></i></a></td><td><a href='#' style='color:red' onclick='eliminar("+d[i].idproducto+")'><i class='far fa-trash-alt'></i></a></td></tr>")
  */
});
$("#enviar").click(function(){
  //definiendo el json a Enviar
  //$("#cat").val()
  var alumnomod ={
    alumno_id: $("#id").val(),
    escuela_id: $("#cat").val(),
    apelnombres: $('input[name="apelnombres"]').val(),
    correo: $('input[name="correo"]').val(),
    telefono: $('input[name="telefono"]').val(),
    opc:"4"
  };

  var alumno ={
    escuela_id: $("#cat").val(),
    apelnombres: $('input[name="apelnombres"]').val(),
    correo: $('input[name="correo"]').val(),
    telefono: $('input[name="telefono"]').val(),
    opc:"2"
  };
  console.log(alumno);
  if($("#id").val() == 0){
    $.post("SA",alumno,function(response){
      console.log(response);
    }).done(function(){
      location.reload();
    });
  }else{
		bootbox.confirm("Desea Modificar?", function(result) {
			if(result){
			 	bootbox.alert("Registro Modificado Correctamente...!", function() {
				$.post( "SA", alumnomod ).done(function(data){
					$("#id").val(0);
          location.reload();

				});
			 	});
			}else{
		    	bootbox.alert("El registro no se Modifico...!");

		    }});

  }

});
function eliminar(id){
  bootbox.confirm("Desea Eliminar?", function(result) {
  if(result){
    bootbox.alert("Registro Eliminado Correctamente...!", function() {
      $.get("SA",{id:id,opc:5},function(data){

      }).done(function(){
        location.reload();
      });
    });

  }else{
    bootbox.alert("El registro no se Elimino...!")
  }});
}


function modificar(id){
$.post("SA",{id:id,opc:3},function(response){
        let a = JSON.parse(response);
        console.log(a);
        $("#cat").val(a[0].escuela_id);
        $("#cat").append(a[0].escuela_id+" "+a[0].nombrecat);
        $('input[name="apelnombres"]').val(a[0].apelnombres);
        $('input[name="correo"]').val(a[0].correo);
        $('input[name="telefono"]').val(a[0].telefono);
        $("#id").val(a[0].alumno_id);
});
}
