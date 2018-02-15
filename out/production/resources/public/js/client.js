$(document).ready(function(){
    console.log("Step 3: Counsoouul the vampire");

    $("#getListBtn").on("click", function(){
                goGetList();
    });
});

function goGetList(){
    $.ajax({
        type: "GET",
        url: "/people",
        success: function(data){

appendPeople(data.people);
        }
    });
}

function appendPeople(array){
    for(var i = 0; i <array.length; i++){
        console.log(array[i]);
        appendDom(array[i]);
            }
}

function appendDom(data){
    $("#container").append("<div></div>");
    var el = $("#container").children().last();
    el.append("<p>" + data.name + " is from " + data.city + "</p>");

}