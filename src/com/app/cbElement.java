package com.app;
public class cbElement
{
    private String key;
    private Object value;

    public cbElement(String key, Object value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public String getKey()
    {
        return key;
    }

    public Object getValue()
    {
        return value;
    }
}
