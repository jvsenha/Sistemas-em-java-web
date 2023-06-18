/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function mascara(i,t){
var v = i.value;
if(isNaN(v[v.length-1])){
i.value = v.substring(0, v.length-1);
return;
}
if(t == "data"){
i.setAttribute("maxlength", "10");
if (v.length == 2 || v.length == 5) i.value += "/";
}
if(t == "cpf"){
i.setAttribute("maxlength", "14");
if (v.length == 3 || v.length == 7) i.value += ".";
if (v.length == 11) i.value += "-";
}
if(t == "cnpj"){
i.setAttribute("maxlength", "18");
if (v.length == 2 || v.length == 6) i.value += ".";
if (v.length == 10) i.value += "/";
if (v.length == 15) i.value += "-";
}
if(t == "cep"){
i.setAttribute("maxlength", "10");
if (v.length == 2) i.value += ".";
if (v.length == 6) i.value += "-";
}
if(t === "tel"){
i.setAttribute("maxlength", "13");
if (v.length ===2) i.value += "-";
if (v.length === 8) i.value += "-";
}
}
