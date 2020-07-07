/*********************************************************************************
 *                                                                               *
 * The MIT License (MIT)                                                         *
 *                                                                               *
 * Copyright (c) 2015-2020 aoju.org OSHI and other contributors.                 *
 *                                                                               *
 * Permission is hereby granted, free of charge, to any person obtaining a copy  *
 * of this software and associated documentation files (the "Software"), to deal *
 * in the Software without restriction, including without limitation the rights  *
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell     *
 * copies of the Software, and to permit persons to whom the Software is         *
 * furnished to do so, subject to the following conditions:                      *
 *                                                                               *
 * The above copyright notice and this permission notice shall be included in    *
 * all copies or substantial portions of the Software.                           *
 *                                                                               *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR    *
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,      *
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE   *
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER        *
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, *
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN     *
 * THE SOFTWARE.                                                                 *
 ********************************************************************************/
package org.aoju.bus.health.builtin.hardware;

import org.aoju.bus.core.annotation.Immutable;
import org.aoju.bus.health.Formats;

/**
 * The PhysicalMemory class represents a physical memory device located on a
 * computer system and available to the operating system.
 *
 * @author Kimi Liu
 * @version 6.0.2
 * @since JDK 1.8+
 */
@Immutable
public class PhysicalMemory {

    private final String bankLabel;
    private final long capacity;
    private final long clockSpeed;
    private final String manufacturer;
    private final String memoryType;

    public PhysicalMemory(String bankLabel, long capacity, long clockSpeed, String manufacturer, String memoryType) {
        this.bankLabel = bankLabel;
        this.capacity = capacity;
        this.clockSpeed = clockSpeed;
        this.manufacturer = manufacturer;
        this.memoryType = memoryType;
    }

    /**
     * The bank and/or slot label.
     *
     * @return the bank label
     */
    public String getBankLabel() {
        return bankLabel;
    }

    /**
     * The capacity of memory bank in bytes.
     *
     * @return the capacity
     */
    public long getCapacity() {
        return capacity;
    }

    /**
     * The configured memory clock speed in hertz.
     * <p>
     * For DDR memory, this is the data transfer rate, which is a multiple of the
     * actual bus clock speed.
     *
     * @return the clock speed
     */
    public long getClockSpeed() {
        return clockSpeed;
    }

    /**
     * The manufacturer of the physical memory.
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * The type of physical memory
     *
     * @return the memory type
     */
    public String getMemoryType() {
        return memoryType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bank label: " + getBankLabel());
        sb.append(", Capacity: " + Formats.formatBytes(getCapacity()));
        sb.append(", Clock speed: " + Formats.formatHertz(getClockSpeed()));
        sb.append(", Manufacturer: " + getManufacturer());
        sb.append(", Memory type: " + getMemoryType());
        return sb.toString();
    }

}