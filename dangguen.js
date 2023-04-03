/* window.onscroll = function() { 
    if((window.innerHeight + window.scrollY) >= document.body.offsetHeight) {
      var toAdd = document.createElement("div");
      toAdd.classList.add("py-5")  
      document.querySelector('article').appendChild(toAdd);
    }
}
 */

window.onscroll = function() { 
    if((window.innerHeight + window.scrollY) >= document.body.offsetHeight) {
      const toAdd = document.createElement("div");
      const box = document.getElementsByClassName('container');
      const clonedBox = box[0].cloneNode(true); // 첫 번째 card 엘리먼트를 클론합니다.
      toAdd.appendChild(clonedBox); // toAdd 내부에 클론된 card를 추가합니다.
      document.querySelector('article').appendChild(toAdd);
    }
  }