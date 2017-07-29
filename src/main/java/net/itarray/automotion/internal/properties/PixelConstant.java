package net.itarray.automotion.internal.properties;

import net.itarray.automotion.internal.geometry.Direction;
import net.itarray.automotion.internal.geometry.Scalar;
import net.itarray.automotion.validation.properties.Expression;

public class PixelConstant implements Expression<Scalar> {

    private final Scalar value;

    public PixelConstant(Scalar value) {
        this.value = value;
    }

    @Override
    public Scalar evaluateIn(Context context, Direction direction) {
        return value;
    }

    @Override
    public String getDescription(Context context, Direction direction) {
        return value.toString() + "px";
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PixelConstant)) {
            return false;
        }
        PixelConstant other = (PixelConstant) object;
        return value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}