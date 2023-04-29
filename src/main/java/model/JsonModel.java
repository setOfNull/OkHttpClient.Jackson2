package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonModel {
    private String product;
    private String init;
    private Dataseries[] dataseries;

    @Data
    static  class Dataseries {
        private double timepoint;
        private double cloudcover;
        private double seeing;
        private double transparency;
        private double lifted_index;
        private double rh2m;
        private Wind10m wind10m;
        private double temp2m;
        private String prec_type;

        @Data
        static  class Wind10m{
            private String direction;
            private double speed;
        }
    }

}
