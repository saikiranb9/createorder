package com.atd.microservices.core.createorder.external.domains;

public enum FillStatus {

    FILL{
        @Override
        public String toString() {
            return "FILL";
        }
    },
    KILL{
        @Override
        public String toString() {
            return "KILL";
        }
    },
    FILLED{
        @Override
        public String toString() {
            return "FILLED";
        }
    },
    KILLED{
        @Override
        public String toString() {
            return "KILLED";
        }
    },
    NONE{
        @Override
        public String toString() {
            return "NONE";
        }
    },
    FOK{
        @Override
        public String toString() {
            return "FOK";
        }
    },
    FAK{
        @Override
        public String toString() {
            return "FAK";
        }
    },
    BACKORDERED{
        @Override
        public String toString() {
            return "BACKORDERED";
        }
    }
}
