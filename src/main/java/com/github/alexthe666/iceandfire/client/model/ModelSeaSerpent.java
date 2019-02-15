package com.github.alexthe666.iceandfire.client.model;

import com.github.alexthe666.iceandfire.entity.EntityAmphithere;
import com.github.alexthe666.iceandfire.entity.EntitySeaSerpent;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelSeaSerpent extends ModelDragonBase {
    public AdvancedModelRenderer BodyUpper;
    public AdvancedModelRenderer BodyLower;
    public AdvancedModelRenderer Neck1;
    public AdvancedModelRenderer BodyFinUpper;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer BodyFinLower;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer TailFin1;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer TailFin2;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer TailFin3;
    public AdvancedModelRenderer Tail5;
    public AdvancedModelRenderer TailFin4;
    public AdvancedModelRenderer Tail6;
    public AdvancedModelRenderer TailFinT1;
    public AdvancedModelRenderer TailFinT4;
    public AdvancedModelRenderer TailFinT3;
    public AdvancedModelRenderer TailFinT2;
    public AdvancedModelRenderer TailFinB3;
    public AdvancedModelRenderer TailFinB2;
    public AdvancedModelRenderer TailFinB1;
    public AdvancedModelRenderer Neck2;
    public AdvancedModelRenderer NeckFin1;
    public AdvancedModelRenderer Neck3;
    public AdvancedModelRenderer NeckFin2;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer NeckFin3;
    public AdvancedModelRenderer HeadFront;
    public AdvancedModelRenderer Jaw;
    public AdvancedModelRenderer HeadFinL;
    public AdvancedModelRenderer HeadFinR;
    public AdvancedModelRenderer Teeth1;
    public AdvancedModelRenderer Teeth2;
    public AdvancedModelRenderer Teeth2Bottom;
    public AdvancedModelRenderer Teeth1Bottom;
    private ModelAnimator animator;

    public ModelSeaSerpent() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.Tail6 = new AdvancedModelRenderer(this, 97, 15);
        this.Tail6.setRotationPoint(0.0F, 0.7F, 11.0F);
        this.Tail6.addBox(-1.02F, -0.9F, 1.0F, 2, 3, 12, 0.0F);
        this.setRotateAngle(Tail6, 0.0036651914291880917F, -0.0F, 0.0F);
        this.NeckFin3 = new AdvancedModelRenderer(this, 42, 2);
        this.NeckFin3.setRotationPoint(0.0F, -0.8F, -2.4F);
        this.NeckFin3.addBox(-0.0F, -0.4F, -2.0F, 1, 6, 5, 0.0F);
        this.setRotateAngle(NeckFin3, 3.141592653589793F, -0.0F, 0.0F);
        this.Teeth2Bottom = new AdvancedModelRenderer(this, 5, 16);
        this.Teeth2Bottom.setRotationPoint(0.0F, 0.0F, -1.2F);
        this.Teeth2Bottom.addBox(-1.52F, 0.1F, -5.5F, 1, 1, 6, 0.0F);
        this.setRotateAngle(Teeth2Bottom, 0.0F, -0.0F, -3.141592653589793F);
        this.Teeth2 = new AdvancedModelRenderer(this, 6, 16);
        this.Teeth2.mirror = true;
        this.Teeth2.setRotationPoint(0.0F, 0.0F, -1.02F);
        this.Teeth2.addBox(-0.4F, 0.1F, -6.0F, 2, 1, 6, 0.0F);
        this.TailFinT1 = new AdvancedModelRenderer(this, 19, 2);
        this.TailFinT1.setRotationPoint(0.0F, -0.8F, 9.2F);
        this.TailFinT1.addBox(-0.0F, -1.1F, -1.7F, 1, 5, 9, 0.0F);
        this.setRotateAngle(TailFinT1, 3.141592653589793F, -0.0F, 0.0F);
        this.Jaw = new AdvancedModelRenderer(this, 34, 55);
        this.Jaw.setRotationPoint(0.0F, 0.2F, -3.8F);
        this.Jaw.addBox(-1.5F, -0.4F, -6.6F, 3, 1, 7, 0.0F);
        this.TailFinT3 = new AdvancedModelRenderer(this, 63, 5);
        this.TailFinT3.mirror = true;
        this.TailFinT3.setRotationPoint(0.0F, -0.8F, 7.0F);
        this.TailFinT3.addBox(-0.98F, -1.0F, -2.2F, 1, 5, 5, 0.0F);
        this.setRotateAngle(TailFinT3, 3.141592653589793F, -3.141592653589793F, 0.0F);
        this.BodyLower = new AdvancedModelRenderer(this, 93, 47);
        this.BodyLower.setRotationPoint(0.0F, -0.3F, 6.7F);
        this.BodyLower.addBox(-3.52F, -1.6F, -0.5F, 7, 6, 8, 0.0F);
        this.HeadFront = new AdvancedModelRenderer(this, 6, 44);
        this.HeadFront.setRotationPoint(0.0F, -0.4F, -3.9F);
        this.HeadFront.addBox(-1.5F, -2.8F, -7.0F, 3, 3, 7, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 77, 35);
        this.Tail1.setRotationPoint(0.0F, 0.5F, 5.5F);
        this.Tail1.addBox(-2.5F, -2.0F, 1.0F, 5, 6, 6, 0.0F);
        this.setRotateAngle(Tail1, -0.06335545184739416F, -0.0F, 0.0F);
        this.Teeth1Bottom = new AdvancedModelRenderer(this, 5, 16);
        this.Teeth1Bottom.mirror = true;
        this.Teeth1Bottom.setRotationPoint(0.0F, 0.0F, -1.2F);
        this.Teeth1Bottom.addBox(0.52F, 0.1F, -5.5F, 1, 1, 6, 0.0F);
        this.setRotateAngle(Teeth1Bottom, 0.0F, -0.0F, -3.141592653589793F);
        this.BodyFinLower = new AdvancedModelRenderer(this, 120, 0);
        this.BodyFinLower.setRotationPoint(0.0F, -0.8F, 4.5F);
        this.BodyFinLower.addBox(-0.0F, -0.4F, -3.5F, 1, 5, 7, 0.0F);
        this.setRotateAngle(BodyFinLower, 3.141592653589793F, -0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 102, 34);
        this.Tail2.setRotationPoint(0.0F, -0.1F, 5.8F);
        this.Tail2.addBox(-2.0F, -1.6F, 0.9F, 4, 5, 8, 0.0F);
        this.setRotateAngle(Tail2, -0.004537856055185257F, 0.0F, 0.0F);
        this.BodyFinUpper = new AdvancedModelRenderer(this, 100, 0);
        this.BodyFinUpper.setRotationPoint(0.0F, -0.8F, 4.5F);
        this.BodyFinUpper.addBox(-0.0F, -0.4F, -3.2F, 1, 5, 7, 0.0F);
        this.setRotateAngle(BodyFinUpper, 3.141592653589793F, -0.0F, 0.0F);
        this.TailFin4 = new AdvancedModelRenderer(this, 173, 0);
        this.TailFin4.setRotationPoint(0.0F, -0.8F, 4.5F);
        this.TailFin4.addBox(-0.0F, -0.4F, -6.2F, 1, 5, 9, 0.0F);
        this.setRotateAngle(TailFin4, 3.141592653589793F, -0.0F, 0.0F);
        this.TailFin2 = new AdvancedModelRenderer(this, 154, 0);
        this.TailFin2.setRotationPoint(0.0F, -0.8F, 4.5F);
        this.TailFin2.addBox(-0.0F, -0.4F, -4.0F, 1, 5, 7, 0.0F);
        this.setRotateAngle(TailFin2, 3.141592653589793F, -0.0F, 0.0F);
        this.TailFinT2 = new AdvancedModelRenderer(this, 63, 5);
        this.TailFinT2.setRotationPoint(0.0F, -1.2F, 2.0F);
        this.TailFinT2.addBox(0.02F, -1.0F, -2.9F, 1, 5, 5, 0.0F);
        this.setRotateAngle(TailFinT2, 3.141592653589793F, 0.0F, 0.0F);
        this.Neck2 = new AdvancedModelRenderer(this, 42, 44);
        this.Neck2.setRotationPoint(0.0F, -0.8F, -7.3F);
        this.Neck2.addBox(-2.0F, -0.8F, -5.0F, 4, 4, 6, 0.0F);
        this.TailFinB1 = new AdvancedModelRenderer(this, 42, 2);
        this.TailFinB1.mirror = true;
        this.TailFinB1.setRotationPoint(0.0F, 1.0F, 2.3F);
        this.TailFinB1.addBox(-1.02F, -0.4F, -2.0F, 1, 5, 5, 0.0F);
        this.setRotateAngle(TailFinB1, 3.141592653589793F, -0.0F, -3.141592653589793F);
        this.Tail4 = new AdvancedModelRenderer(this, 72, 21);
        this.Tail4.setRotationPoint(0.0F, -0.1F, 7.9F);
        this.Tail4.addBox(-2.0F, -1.3F, 0.9F, 4, 4, 9, 0.0F);
        this.setRotateAngle(Tail4, 0.009948376736367679F, -0.0F, 0.0F);
        this.TailFin1 = new AdvancedModelRenderer(this, 140, 0);
        this.TailFin1.setRotationPoint(0.0F, -0.8F, 4.5F);
        this.TailFin1.addBox(-0.0F, -0.4F, -2.8F, 1, 5, 5, 0.0F);
        this.setRotateAngle(TailFin1, 3.141592653589793F, -0.0F, 0.0F);
        this.Neck1 = new AdvancedModelRenderer(this, 57, 44);
        this.Neck1.setRotationPoint(-0.0F, 0.5F, 1.1F);
        this.Neck1.addBox(-2.5F, -2.0F, -8.0F, 5, 5, 10, 0.0F);
        this.setRotateAngle(Neck1, 0.014137166941154071F, -0.0F, 0.0F);
        this.TailFinB2 = new AdvancedModelRenderer(this, 63, 5);
        this.TailFinB2.setRotationPoint(0.0F, 1.2F, 6.1F);
        this.TailFinB2.addBox(0.0F, -1.0F, -2.0F, 1, 5, 5, 0.0F);
        this.setRotateAngle(TailFinB2, 3.141592653589793F, -3.141592653589793F, -3.141592653589793F);
        this.Neck3 = new AdvancedModelRenderer(this, 25, 64);
        this.Neck3.setRotationPoint(0.0F, -0.8F, -3.9F);
        this.Neck3.addBox(-2.0F, -0.6F, -7.0F, 4, 5, 6, 0.0F);
        this.setRotateAngle(Neck3, 0.03717551306747922F, -0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 6, 54);
        this.Head.setRotationPoint(0.0F, 2.9F, -5.0F);
        this.Head.addBox(-2.5F, -3.5F, -4.1F, 5, 5, 4, 0.0F);
        this.HeadFinR = new AdvancedModelRenderer(this, 42, 2);
        this.HeadFinR.setRotationPoint(1.0F, -1.5F, -1.2F);
        this.HeadFinR.addBox(-0.5F, 1.0F, -2.0F, 1, 5, 5, 0.0F);
        this.setRotateAngle(HeadFinR, 1.5707963267948966F, -0.6283185307179586F, 3.141592653589793F);
        this.TailFinB3 = new AdvancedModelRenderer(this, 40, 17);
        this.TailFinB3.mirror = true;
        this.TailFinB3.setRotationPoint(0.0F, 0.4F, 14.9F);
        this.TailFinB3.addBox(-1.02F, -0.4F, -2.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(TailFinB3, 3.141592653589793F, 0.0F, -3.141592653589793F);
        this.TailFinT4 = new AdvancedModelRenderer(this, 40, 17);
        this.TailFinT4.setRotationPoint(0.0F, -0.4F, 14.9F);
        this.TailFinT4.addBox(-0.0F, -0.4F, -2.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(TailFinT4, 3.141592653589793F, -0.0F, 0.0F);
        this.NeckFin1 = new AdvancedModelRenderer(this, 80, 0);
        this.NeckFin1.setRotationPoint(0.0F, -0.8F, -2.3F);
        this.NeckFin1.addBox(-0.0F, -0.4F, -2.0F, 1, 5, 8, 0.0F);
        this.setRotateAngle(NeckFin1, 3.141592653589793F, -0.0F, 0.0F);
        this.Teeth1 = new AdvancedModelRenderer(this, 6, 16);
        this.Teeth1.setRotationPoint(-0.1F, 0.0F, -1.02F);
        this.Teeth1.addBox(-1.6F, 0.1F, -6.0F, 2, 1, 6, 0.0F);
        this.NeckFin2 = new AdvancedModelRenderer(this, 63, 5);
        this.NeckFin2.setRotationPoint(0.0F, -0.8F, -2.3F);
        this.NeckFin2.addBox(0.02F, -0.4F, -2.0F, 1, 5, 5, 0.0F);
        this.setRotateAngle(NeckFin2, 3.141592653589793F, -0.0F, 0.0F);
        this.HeadFinL = new AdvancedModelRenderer(this, 42, 2);
        this.HeadFinL.mirror = true;
        this.HeadFinL.setRotationPoint(-1.0F, -1.3F, -1.2F);
        this.HeadFinL.addBox(-0.5F, 1.0F, -2.0F, 1, 5, 5, 0.0F);
        this.setRotateAngle(HeadFinL, 1.5707963267948966F, 0.6283185307179586F, -3.141592653589793F);
        this.BodyUpper = new AdvancedModelRenderer(this, 67, 63);
        this.BodyUpper.setRotationPoint(0.0F, 19.5F, -10.0F);
        this.BodyUpper.addBox(-3.5F, -1.8F, 0.0F, 7, 6, 7, 0.0F);
        this.TailFin3 = new AdvancedModelRenderer(this, 173, 0);
        this.TailFin3.setRotationPoint(0.0F, -0.8F, 4.5F);
        this.TailFin3.addBox(-0.0F, -0.4F, -5.2F, 1, 5, 9, 0.0F);
        this.setRotateAngle(TailFin3, 3.141592653589793F, -0.0F, 0.0F);
        this.Tail5 = new AdvancedModelRenderer(this, 128, 20);
        this.Tail5.setRotationPoint(0.0F, -0.2F, 8.6F);
        this.Tail5.addBox(-1.5F, -0.9F, 1.0F, 3, 4, 12, 0.0F);
        this.setRotateAngle(Tail5, 0.0036651914291880917F, -0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 72, 21);
        this.Tail3.setRotationPoint(0.0F, -0.1F, 7.7F);
        this.Tail3.addBox(-2.02F, -1.3F, 0.9F, 4, 4, 9, 0.0F);
        this.setRotateAngle(Tail3, 0.009948376736367679F, -0.0F, 0.0F);
        this.Tail5.addChild(this.Tail6);
        this.Neck3.addChild(this.NeckFin3);
        this.Jaw.addChild(this.Teeth2Bottom);
        this.HeadFront.addChild(this.Teeth2);
        this.Tail5.addChild(this.TailFinT1);
        this.Head.addChild(this.Jaw);
        this.Tail6.addChild(this.TailFinT3);
        this.BodyUpper.addChild(this.BodyLower);
        this.Head.addChild(this.HeadFront);
        this.BodyLower.addChild(this.Tail1);
        this.Jaw.addChild(this.Teeth1Bottom);
        this.BodyLower.addChild(this.BodyFinLower);
        this.Tail1.addChild(this.Tail2);
        this.BodyUpper.addChild(this.BodyFinUpper);
        this.Tail4.addChild(this.TailFin4);
        this.Tail2.addChild(this.TailFin2);
        this.Tail6.addChild(this.TailFinT2);
        this.Neck1.addChild(this.Neck2);
        this.Tail6.addChild(this.TailFinB1);
        this.Tail3.addChild(this.Tail4);
        this.Tail1.addChild(this.TailFin1);
        this.BodyUpper.addChild(this.Neck1);
        this.Tail6.addChild(this.TailFinB2);
        this.Neck2.addChild(this.Neck3);
        this.Neck3.addChild(this.Head);
        this.Head.addChild(this.HeadFinR);
        this.Tail6.addChild(this.TailFinB3);
        this.Tail6.addChild(this.TailFinT4);
        this.Neck1.addChild(this.NeckFin1);
        this.HeadFront.addChild(this.Teeth1);
        this.Neck2.addChild(this.NeckFin2);
        this.Head.addChild(this.HeadFinL);
        this.Tail3.addChild(this.TailFin3);
        this.Tail4.addChild(this.Tail5);
        this.Tail2.addChild(this.Tail3);
        animator = ModelAnimator.create();
        this.Head.setScale(1.01F, 1.01F, 1.01F);
        this.updateDefaultPose();

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.BodyUpper.render(f5);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        animator.update(entity);

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        AdvancedModelRenderer[] TAIL = new AdvancedModelRenderer[]{Tail1, Tail2, Tail3, Tail4, Tail5, Tail6};
        AdvancedModelRenderer[] TAIL_END = new AdvancedModelRenderer[]{Tail5, Tail6};
        AdvancedModelRenderer[] ENTIRE_BODY = new AdvancedModelRenderer[]{Neck3, Neck2, Neck3, BodyUpper, BodyLower, Tail1, Tail2, Tail3, Tail4, Tail5, Tail6};
        AdvancedModelRenderer[] NECK = new AdvancedModelRenderer[]{Neck1, Neck2, Neck3, Head};
        EntitySeaSerpent serpent = (EntitySeaSerpent) entity;

            //this.chainSwing(ENTIRE_BODY, 0.35F, 0.2F, 4.5F, f, f1);
        //this.chainSwing(TAIL_END, 0.35F, 0.15F, 0, f, f1);
            //this.swing(Tail6, 0.35F, 0.15F, false, 0, 0, f, f1);
        //this.chainSwing(NECK, 0.35F, 0.15F, 2, f, f1);
        serpent.pitch_buffer.applyChainWaveBuffer(BodyUpper);
        serpent.tail_buffer.applyChainSwingBuffer(TAIL);
        serpent.head_buffer.applyChainSwingBufferReverse(NECK);
    }

    @Override
    public void renderStatue() {
        this.resetToDefaultPose();
        this.BodyUpper.render(0.0625F);
    }
}
