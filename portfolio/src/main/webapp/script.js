// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['Hello world!', '¡Hola Mundo!', '你好，世界！', 'Bonjour le monde!'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}

async function showServerTime() {
    const responseFromServer = await fetch('/date');
    const textFromResponse = await responseFromServer.text();
  
    const dateContainer = document.getElementById('date-container');
    dateContainer.innerText = textFromResponse;
}

/** Fetches messages from the server and adds them to the page. */
async function getMessage(){
    const responseFromServer = await fetch('/random-message');
  // The json() function returns an object that contains fields that we can
  // reference to create HTML.
    const messages = await responseFromServer.json();
    

    const messageParagraphElement = document.getElementById('message-container');

    messageParagraphElement.innerHTML = "";
    /** using convertToJsonUsingGson() messages is an array of strings */
    console.log(messages);
    
    const length = messages.length;
    // console.log(length);
    
    const randomNum = Math.floor(Math.random() * length );
    console.log(randomNum);
    
    messageParagraphElement.appendChild(createParagraphElement(messages[randomNum])); 
    
    /** using convertToJson() messages is an array of objects*/ 

    // const length = Object.keys(messages).length;
    // if (randomNum == 0) {
    //     messageParagraphElement.appendChild(
    //     createParagraphElement(messages.one));  
    // } else if (randomNum == 1) {        
    //     messageParagraphElement.appendChild(
    //     createParagraphElement(messages.two));
    // } else {
    //     messageParagraphElement.appendChild(
    //     createParagraphElement(messages.three));
    // }
}

/** Creates an <p> element containing text. */
function createParagraphElement(text) {
    const paragraphElement = document.createElement('p');
    paragraphElement.innerText = text;
    return paragraphElement;
}

/** Creates a map and adds it to the page. */
function createMap() {
    const map = new google.maps.Map(
        document.getElementById('map'),
        {center: {lat: 37.422, lng: -122.084}, zoom: 16});
  }