package br.ufpr.tads.dac.ds.model;

import java.io.Serializable;

/**
 *
 * @author Lucas
 */
public abstract class Model<I extends Serializable> implements Serializable {
    public abstract I getId();
    public abstract void setId(I id);
}
