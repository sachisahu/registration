package org.kumoricon.registration.model.role;

import org.springframework.security.core.GrantedAuthority;

/**
 * A "right" is the power to do a specific thing. For example, check in an at-con attendee or view a
 * specific report. In the Spring world, that is called an Authority, which is why this class
 * implements the GrantedAuthority interface.
 */

public class Right implements Comparable<Right>, GrantedAuthority {
    private Integer id;
    private String name;
    private String description;

    public Right() {}

    public Right(String name) {
        this();
        this.name = name;
    }

    public Right(String name, String description) {
        this(name);
        this.description = description;
    }

    public Right(Integer id, String name, String description) {
        this(name);
        this.id = id;
        this.description = description;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if ( !(other instanceof Right) ) return false;

        final Right right = (Right) other;

        return right.getName().equals(getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    public Integer getId() { return id; }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        if (id != null) {
            return String.format("[Right %s: %s]", id, name);
        } else {
            return String.format("[Right: %s]", name);
        }
    }


    @Override
    public String getAuthority() {
        return name;
    }

    @Override
    public int compareTo(Right o) {
        if (o != null) {
            return name.compareTo(o.getName());
        }
        return 0;
    }
}
