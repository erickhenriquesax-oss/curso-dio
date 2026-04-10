package domain;

import dao.GenericDAO;

public abstract class GenericDomain<T> {

    private T id;

    public GenericDomain(T id) {
        this.id = id;
    }
    public GenericDomain() {    
    }
    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GenericDomain other = (GenericDomain) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "GenericDomain [id=" + id + ", getId()=" + getId() + ", hashCode()=" + hashCode() + ", getClass()="
                + getClass() + ", toString()=" + super.toString() + "]";
    }

    
    
}
