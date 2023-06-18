// Initialize and add the map
function initMap() {
  // The location of Uluru
  const uluru = { lat: -20.3016062, lng: -50.2768989 };
  // The map, centered at Uluru
  const map = new google.maps.Map(document.getElementById("map"), {
    zoom: 2,
    center: uluru,
  });
  // The marker, positioned at Uluru
  const marker = new google.maps.Marker({
    position: uluru,
    map: map,
  });
}

window.initMap = initMap;