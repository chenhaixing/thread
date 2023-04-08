package com.chenhaixing.mode.factory.type;

public class IntelFactory implements BrandFactory {

    public Cpu getCpu() {
        return new IntelCpu();
    }

    public Mainboard getMainboard() {
        return new IntelMainboard();
    }
}
