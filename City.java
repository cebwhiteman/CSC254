public class City {


        private String city;
        private String region;
        private String country;

        //data members or data fields are "encapsulated" by declaring the private

        //constructor
        //no return type on constructors

        public City(String city, String region, String country) {
            setCity(city);
            setRegion(region);
            setCountry(country);
        }

        public City() {
            this("", "", "");
        }


        //setters
        //setters are almost always a void data tyle

        public void setCity(String city) {
            if (city.length() > 0) {
                this.city = city; //"this" means that it belongs to the class as a whole
            } else {
                this.city = "unknown";
            }
        }

        public void setRegion(String region) {
            this.region = (region.length() > 0) ? region : "unknown";
        }

        public void setCountry(String country) {
            this.country = (country.length() > 0) ? country : "unknown";
        }


        //getters
        public String getCity() {
            return city;
        }

        public String getRegion() {
            return region;
        }

        public String getCountry() {
            return country;
        }


        @Override
        public String toString() {

            String result;
            result = String.format("%s, %s, %s", city, region, country);
            return result;
        }


    }
