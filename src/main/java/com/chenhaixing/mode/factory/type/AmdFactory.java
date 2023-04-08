package com.chenhaixing.mode.factory.type;

public class AmdFactory implements BrandFactory {

    public Cpu getCpu() {
        return new AmdCpu();
    }

    public Mainboard getMainboard() {
        return new AmdMainboard();
    }
}
