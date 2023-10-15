package com.atd.microservices.core.createorder.external.domains;

/**
 * @author: Manoj Bisht
 * @date: 2019-10-23
 */
public enum FulfillSourceType {

    LOCAL{
        @Override
        public String toString() {
            return "LOCAL";
        }
    },
    LOCALPLUS {
        @Override
        public String toString() {
            return "LOCALPLUS";
        }
    },
    REST_LOCALPLUS {
        @Override
        public String toString() {
            return "REST_LOCALPLUS";
        }
    },
    NATIONAL{
        @Override
        public String toString() {
            return "NATIONAL";
        }
    },
    REST_NATIONAL{
        @Override
        public String toString() {
            return "REST_NATIONAL";
        }
    },
    SINGLE_DC{
        @Override
        public String toString() {
            return "SINGLE_DC";
        }
    },
    ALL_DC{
        @Override
        public String toString() {
            return "ALL_DC";
        }
    },
    VIV_VENDOR{
        @Override
        public String toString() {
            return "VIV_VENDOR";
        }
    },
    REST_VIV_VENDOR{
        @Override
        public String toString() {
            return "REST_VIV_VENDOR";
        }
    },
    THIRD_PARTY{
        @Override
        public String toString() {
            return "THIRD_PARTY";
        }
    },
    REST_THIRD_PARTY{
        @Override
        public String toString() {
            return "REST_THIRD_PARTY";
        }
    },
    LOCAL_AND_NATIONAL_ONLY{
    	@Override
        public String toString() {
            return "LOCAL_AND_NATIONAL_ONLY";
        }
    },
    SOURCE_DC{
    	@Override
    	public String toString() {
    		return "SOURCE_DC";
    	}
    },
    ASSEMBLY{
        @Override
        public String toString() {
            return "ASSEMBLY";
        }
    },
    KIT_ASSEMBLY{
        @Override
        public String toString() {
            return "KIT_ASSEMBLY";
        }
    }
}
