# REST-geolocation
 
## Author
- [Tomasz Rafalski] (https://github.com/rt44474)

Prosta aplikacja służąca do odbierania i zapisywania informacji o położeniu i identyfikatora telefonu.
Utworzone zostały 4 endpointy:

-GET /geolocation - pobiera wszystkie zapisane położenia w bazie danych

-GET /geolocation/{id} - pobiera położenia dla podanego idetyfikatora

-GET /geolocation/byDeviceId - pobiera wszystkie zapisane położenia dla datego urządzenia

-POST /geolocation - zapisuje położenie

