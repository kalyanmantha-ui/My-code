const apiKey = '495b0fc7eb92416bad463241241507'; // Replace with your WeatherAPI key
const weatherEndpoint = 'https://api.weatherapi.com/v1/current.json';

// DOM Elements
const searchInput = document.getElementById('search-input');
const searchButton = document.getElementById('search-button');
const weatherInfo = document.getElementById('weather-info');

// Event listeners
searchButton.addEventListener('click', searchWeather);
searchInput.addEventListener('keyup', function(event) {
    if (event.key === 'Enter') {
        searchWeather();
    }
});

// Function to fetch current weather data
async function getWeather(city) {
    try {
        const response = await fetch(`${weatherEndpoint}?key=${apiKey}&q=${city}`);
        if (!response.ok) {
            throw new Error('City not found');
        }
        const data = await response.json();
        return data;
    } catch (error) {
        console.error('Error fetching weather data:', error);
        return null;
    }
}

// Function to handle search button click
async function searchWeather() {
    const city = searchInput.value.trim();
    if (city) {
        const weatherData = await getWeather(city);
        displayWeather(weatherData);
    } else {
        alert('Please enter a city name');
    }
}

// Function to display weather information
function displayWeather(data) {
    if (!data) {
        weatherInfo.innerHTML = '<p>Weather data not available</p>';
        return;
    }

    const { location, current } = data;
    const { name, region, country } = location;
    const { temp_c, condition, humidity, wind_kph } = current;

    const weatherHTML = `
        <div class="weather-card">
            <h2>${name}, ${region}, ${country}</h2>
            <div class="weather-details">
                <img src="${condition.icon}" alt="${condition.text}">
                <div>
                    <p>${condition.text}</p>
                    <p>Temperature: ${temp_c} &deg;C</p>
                    <p>Humidity: ${humidity}%</p>
                    <p>Wind Speed: ${wind_kph} kph</p>
                </div>
            </div>
        </div>
    `;
    
    weatherInfo.innerHTML = weatherHTML;
}
