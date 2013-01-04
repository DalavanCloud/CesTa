package org.cesta.types;

/**
 * Type <code>Parameter</code> is composed of a name and a value.
 * @author Tobias Smolka
 */
public final class Parameter {
    private String name = null;
    private Object value = null;

    /**
     * Set the name attribute.
     *
     * @param name a <code>String</code> value
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Returns boolean value if value equals yes, true, on or 1 and
     * false if value equals no, false, off or 0. Otherwise null is
     * returned.
     *
     * @param value value
     * @return boolean or null
     */
    protected static Boolean getBooleanValue(String value){
       boolean isTrue = ("on".equalsIgnoreCase(value)
                || "true".equalsIgnoreCase(value)
                || "yes".equalsIgnoreCase(value)
                || "1".equalsIgnoreCase(value));
       boolean isFalse = ("off".equalsIgnoreCase(value)
                || "false".equalsIgnoreCase(value)
                || "no".equalsIgnoreCase(value)
                || "0".equalsIgnoreCase(value));

       if (isTrue || isFalse) {
           return isTrue || !isFalse;
       } else {
           return null;
       }
    }

    /**
     * Returns numberic value if value has numeric format (Integer or Double).
     *
     * @param value value
     * @return Integer, Double or null
     */
    protected static Number getNumberValue(String value){
       Number number;
       try {
           number = Integer.valueOf(value);
           return number;
       } catch (NumberFormatException ex){

       }
       try {
           number = Double.valueOf(value);
           return number;
       } catch (NumberFormatException ex){
           // TODO: catch NumberFormatException exception
       }
       return null;
    }

    /**
     * Set the value attribute. If the value has boolean form
     * (i.e. true,yes,on,1,false,no,off) it will be converted to
     * Boolean object. In case it has numeric form, it weill be converted
     * to Integer or Double.
     *
     * @param value a <code>String</code> value
     */
    public void setValue(final String value) {        
        this.value = value;

        Object valueObj;
        if ((valueObj = getBooleanValue(value)) != null) {
            this.value = valueObj;
        } else if ((valueObj = getNumberValue(value)) != null) {
            this.value = valueObj;
        }
    }

    /**
     * Get the name attribute.
     *
     * @return a <code>String</code> value
     */
    public String getName() {
        return name;
    }

    /**
     * Get the value attribute.
     *
     * @return a <code>Object</code> value
     */
    public Object getValue() {
        return value;
    }
}
