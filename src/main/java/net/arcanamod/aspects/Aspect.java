package net.arcanamod.aspects;

import net.arcanamod.Arcana;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Consumer;

public class Aspect {
    private static Logger logger = LogManager.getLogger();

    private final int id;
    private final String aspectName;
    private final ColourRange colours;
    private final Consumer<Object> aspectTickConsumer;

    private Aspect(String name, ColourRange colors, Consumer<Object> aspectTickConsumer){
        this(name,Arcana.nextAspectId(),colors,aspectTickConsumer);
    }

    private Aspect(String name, int id, ColourRange colours, Consumer<Object> aspectTickConsumer){
        this.aspectName = name;
        this.id = id;
        this.colours = colours;
        this.aspectTickConsumer = aspectTickConsumer;
    }

    public void aspectTick(Object sender){
        if (aspectTickConsumer!=null)
            aspectTickConsumer.accept(sender);
    }

    public int getId() {
        return id;
    }

    public ColourRange getColorRange() {
        return colours;
    }

    public String name() {
        return aspectName;
    }

    @Override
    public String toString() {
        return "Aspect: "+aspectName+" ("+id+")";
    }

    public ResourceLocation getVisMeterTexture(){
        // only valid for primals
        return new ResourceLocation(Arcana.modId, "textures/gui/hud/wand/vis/" + aspectName + ".png");
    }

    // Static Methods

    public static Aspect create(String name, ColourRange colors, Consumer<Object> aspectTickConsumer){
        Aspect aspect = new Aspect(name, colors,aspectTickConsumer);
        Aspects.ASPECTS.put(Arcana.arcLoc(name),aspect);
        return aspect;
    }

    public static Aspect fromId(int readInt) {
        return Aspects.ASPECTS.values().stream()
                .filter(entry -> entry.getId() == readInt)
                .findAny().orElse(Aspects.EMPTY);
    }

    public ResourceLocation toResourceLocation() {
        return Aspects.ASPECTS.inverse().get(this);
    }

    public static Aspect fromResourceLocation(ResourceLocation resourceLocation) {
        return Aspects.ASPECTS.get(resourceLocation);
    }
}
