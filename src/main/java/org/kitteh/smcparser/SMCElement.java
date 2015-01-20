/*
 * Copyright 2015 Matt Baxter
 *
 * This file is part of Kitteh SMC Parser.
 *
 * Kitteh SMC Parser is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Kitteh SMC Parser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Kitteh SMC Parser.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.kitteh.smcparser;

public abstract class SMCElement<Type> {
    private String key;
    private Type value;

    protected SMCElement(String key, Type value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    public Type getValue() {
        return this.value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(Type value) {
        this.value = value;
    }
}