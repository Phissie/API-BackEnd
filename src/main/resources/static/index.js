import React from "react";
import ReactDOM from "react-dom";

/*this is an asychronous command that returns a promise. in JS "Fetch" returns a promise and the way you
access is with a promise. the first fetch will get the data and the second .then will console.log the text so we've made a restful call*/
fetch("/recipes").then((response) => response.text())
.then((text) => {
      console.log(text)
    });