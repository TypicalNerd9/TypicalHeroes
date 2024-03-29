package barryflash.superheroes.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelAquaman extends ModelBiped
{

    public ModelRenderer body;
    public ModelRenderer rightarm;
    public ModelRenderer leftarm;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg;
    public ModelRenderer body_1;
    public ModelRenderer leftarm_1;
    public ModelRenderer rightarm_1;
    public ModelRenderer rightarm_2;
    public ModelRenderer leftarm_2;
    public ModelRenderer body_2;
    public ModelRenderer body_3;
    public ModelRenderer body_4;
    public ModelRenderer body_5;
    public ModelRenderer body_6;
    public ModelRenderer body_7;
    public ModelRenderer body_8;
    public ModelRenderer body_9;
    public ModelRenderer body_10;
    public ModelRenderer body_11;
    public ModelRenderer body_12;
    public ModelRenderer body_13;
    public ModelRenderer body_14;
    public ModelRenderer body_15;
    public ModelRenderer body_16;
    public ModelRenderer body_17;
    public ModelRenderer body_18;
    public ModelRenderer body_19;
    public ModelRenderer body_20;
    public ModelRenderer body_21;
    public ModelRenderer body_22;
    public ModelRenderer body_23;
    public ModelRenderer body_24;
    public ModelRenderer body_25;
    public ModelRenderer body_26;
    public ModelRenderer body_27;
    public ModelRenderer body_28;
    public ModelRenderer body_29;
    public ModelRenderer body_30;
    public ModelRenderer body_31;
    public ModelRenderer body_32;
    public ModelRenderer body_33;
    public ModelRenderer body_34;
    public ModelRenderer body_35;
    public ModelRenderer body_36;
    public ModelRenderer body_37;
    public ModelRenderer body_38;
    public ModelRenderer body_39;
    public ModelRenderer rightarm_3;
    public ModelRenderer leftarm_3;
    public ModelRenderer rightarm_4;
    public ModelRenderer leftarm_4;
    public ModelRenderer rightarm_5;
    public ModelRenderer leftarm_5;
    public ModelRenderer rightleg_1;
    public ModelRenderer leftleg_1;
    public ModelRenderer rightleg_2;
    public ModelRenderer leftleg_2;
    public ModelRenderer rightleg_3;
    public ModelRenderer leftleg_3;
    public ModelRenderer rightleg_4;
    public ModelRenderer leftleg_4;
    public ModelRenderer rightleg_5;
    public ModelRenderer leftleg_5;
    public ModelRenderer rightleg_6;
    public ModelRenderer leftleg_6;
    public ModelRenderer rightleg_7;
    public ModelRenderer leftleg_7;
    public ModelRenderer rightleg_8;
    public ModelRenderer leftleg_8;
    public ModelRenderer rightleg_9;
    public ModelRenderer leftleg_9;
    public ModelRenderer rightleg_10;
    public ModelRenderer leftleg_10;
    public ModelRenderer rightleg_11;
    public ModelRenderer leftleg_11;
    public ModelRenderer rightleg_12;
    public ModelRenderer rightleg_13;
    public ModelRenderer leftleg_12;
    public ModelRenderer leftleg_13;
    public ModelRenderer rightarm_6;
    public ModelRenderer rightarm_7;
    public ModelRenderer leftarm_6;
    public ModelRenderer leftarm_7;
  
    public ModelRenderer leftarm_8;
    public ModelRenderer rightarm_8;
    public ModelRenderer leftleg_14;
    public ModelRenderer leftleg_15;
    public ModelRenderer leftleg_16;
    public ModelRenderer rightleg_14;
    public ModelRenderer rightleg_15;
    public ModelRenderer rightleg_16;
    public ModelRenderer leftleg_17;
    public ModelRenderer rightleg_17;
    public ModelRenderer rightleg_18;
    public ModelRenderer leftleg_18;
    public ModelRenderer body_40;
    public ModelRenderer body_41;
    public ModelRenderer body_42;
    public ModelRenderer body_43;
    public ModelRenderer body_44;
    public ModelRenderer body_45;
    public ModelRenderer body_46;
    public ModelRenderer body_47;
    public ModelRenderer body_48;

    public ModelAquaman(float scale) {
     	 super(scale, 0, 128, 128);
     	 
     	 	textureWidth = 128;
     	 	textureHeight = 128;
      
        rightleg_6 = new ModelRenderer(this, 61, 45);
        rightleg_6.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_6.addBox(-18.9F, 2.9F, -2.65F, 1, 5, 2, -0.45F);
        setRotateAngle(rightleg_6, 0.0F, 0.0F, -1.1838568316277536F);
      
        leftleg_11 = new ModelRenderer(this, 63, 60);
        leftleg_11.mirror = true;
        leftleg_11.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_11.addBox(0.0F, 22.0F, -2.01F, 4, 2, 4, 0.2F);
        leftleg_3 = new ModelRenderer(this, 61, 46);
        leftleg_3.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_3.addBox(2.6F, 15.5F, -2.5F, 1, 3, 4, -0.1F);
        setRotateAngle(leftleg_3, 0.0F, 0.0F, 0.045553093477052F);
        leftleg_4 = new ModelRenderer(this, 61, 46);
        leftleg_4.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_4.addBox(13.2F, 6.8F, -2.5F, 1, 2, 4, -0.1F);
        setRotateAngle(leftleg_4, 0.0F, 0.0F, 0.8651597102135892F);
        rightarm = new ModelRenderer(this, 88, 16);
        rightarm.setRotationPoint(5.0F, -2.0F, 0.0F);
        rightarm.addBox(-8.0F, 0.0F, -2.0F, 4, 11, 4, 0.1F);
        rightarm_2 = new ModelRenderer(this, 66, 38);
        rightarm_2.setRotationPoint(5.0F, -2.0F, 0.0F);
        rightarm_2.addBox(-6.0F, -0.2F, -2.0F, 2, 1, 4, 0.22F);
        body_36 = new ModelRenderer(this, 61, 74);
        body_36.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_36.addBox(-3.9F, 9.2F, -2.8F, 1, 3, 1, -0.1F);
        setRotateAngle(body_36, 0.0F, 0.0F, -0.36425021489121656F);
        rightleg_9 = new ModelRenderer(this, 61, 45);
        rightleg_9.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_9.addBox(-20.8F, 3.6F, -2.55F, 1, 2, 2, -0.35F);
        setRotateAngle(rightleg_9, 0.0F, 0.0F, -1.1838568316277536F);
     
        leftleg_15 = new ModelRenderer(this, 61, 46);
        leftleg_15.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_15.addBox(3.25F, 14.5F, 0.5F, 1, 1, 2, -0.1F);
        rightleg_5 = new ModelRenderer(this, 61, 46);
        rightleg_5.mirror = true;
        rightleg_5.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_5.addBox(-4.25F, 14.5F, -2.5F, 1, 1, 4, -0.1F);
        rightleg_14 = new ModelRenderer(this, 61, 46);
        rightleg_14.mirror = true;
        rightleg_14.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_14.addBox(-4.25F, 14.5F, 0.5F, 1, 1, 2, -0.1F);
      
        rightarm_6 = new ModelRenderer(this, 45, 49);
        rightarm_6.setRotationPoint(5.0F, -2.0F, 0.0F);
        rightarm_6.addBox(-9.6F, 5.0F, -0.5F, 3, 4, 1, -0.2F);
       
        leftleg_14 = new ModelRenderer(this, 61, 46);
        leftleg_14.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_14.addBox(13.2F, 6.8F, 1.5F, 1, 2, 1, -0.1F);
        setRotateAngle(leftleg_14, 0.0F, 0.0F, 0.8651597102135892F);
       
        rightarm_4 = new ModelRenderer(this, 45, 36);
        rightarm_4.setRotationPoint(5.0F, -2.0F, 0.0F);
        rightarm_4.addBox(-8.0F, 6.6F, -2.0F, 1, 1, 4, 0.2F);
      
        body_3 = new ModelRenderer(this, 61, 45);
        body_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_3.addBox(-0.8F, 3.6F, -2.65F, 1, 8, 4, -0.45F);
        body_1 = new ModelRenderer(this, 61, 17);
        body_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_1.addBox(-4.0F, 0.0F, -2.0F, 8, 4, 4, 0.3F);
       
        rightleg_10 = new ModelRenderer(this, 61, 45);
        rightleg_10.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_10.addBox(-3.4F, 20.3F, -2.55F, 1, 2, 2, -0.35F);
     
        rightleg_16 = new ModelRenderer(this, 61, 46);
        rightleg_16.mirror = true;
        rightleg_16.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_16.addBox(-3.6F, 15.5F, 1.5F, 1, 3, 1, -0.1F);
        setRotateAngle(rightleg_16, 0.0F, 0.0F, -0.045553093477052F);
        
        body_48 = new ModelRenderer(this, 64, 50);
        body_48.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_48.addBox(-2.3F, 8.7F, 1.0F, 1, 2, 1, 0.2F);
        leftleg_1 = new ModelRenderer(this, 61, 45);
        leftleg_1.mirror = true;
        leftleg_1.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_1.addBox(11.9F, 4.8F, -2.65F, 1, 5, 4, -0.45F);
        setRotateAngle(leftleg_1, 0.0F, 0.0F, 0.8651597102135892F);
        body_12 = new ModelRenderer(this, 61, 46);
        body_12.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_12.addBox(3.0F, 0.3F, -2.05F, 0, 4, 4, 0.3F);
        setRotateAngle(body_12, 0.0F, 0.0F, -0.22759093446006054F);
       
        body_11 = new ModelRenderer(this, 61, 46);
        body_11.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_11.addBox(4.0F, 0.0F, -2.3F, 0, 4, 4, 0.31F);
        body_20 = new ModelRenderer(this, 61, 46);
        body_20.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_20.addBox(-0.9F, 9.2F, -2.4F, 1, 2, 4, 0.0F);
        setRotateAngle(body_20, 0.0F, 0.0F, -0.18203784098300857F);
        body_14 = new ModelRenderer(this, 61, 46);
        body_14.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_14.addBox(3.6F, 0.2F, -2.05F, 0, 2, 4, 0.3F);
        setRotateAngle(body_14, 0.0F, 0.0F, -0.22759093446006054F);
        body_2 = new ModelRenderer(this, 16, 37);
        body_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_2.addBox(-4.0F, 11.0F, -2.01F, 8, 1, 4, 0.2F);
       
        body_17 = new ModelRenderer(this, 61, 47);
        body_17.mirror = true;
        body_17.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_17.addBox(-5.8F, 1.9F, -2.4F, 1, 6, 4, 0.0F);
        setRotateAngle(body_17, 0.0F, 0.0F, -0.4553564018453205F);
        rightarm_7 = new ModelRenderer(this, 45, 49);
        rightarm_7.setRotationPoint(5.0F, -2.0F, 0.0F);
        rightarm_7.addBox(-13.0F, 0.7F, -0.5F, 3, 3, 1, -0.2F);
        setRotateAngle(rightarm_7, 0.0F, 0.0F, -0.6829473363053812F);
        body_29 = new ModelRenderer(this, 61, 46);
        body_29.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_29.addBox(1.1F, 4.2F, -2.35F, 3, 1, 4, 0.0F);
        body_42 = new ModelRenderer(this, 60, 50);
        body_42.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_42.addBox(-7.0F, 0.4F, 1.0F, 1, 2, 1, 0.2F);
        setRotateAngle(body_42, 0.0F, 0.0F, -1.0016444577195458F);
        leftleg_7 = new ModelRenderer(this, 61, 45);
        leftleg_7.mirror = true;
        leftleg_7.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_7.addBox(18.3F, 2.9F, -2.65F, 1, 5, 2, -0.45F);
        setRotateAngle(leftleg_7, 0.0F, 0.0F, 1.1838568316277536F);
      
        leftleg = new ModelRenderer(this, 88, 36);
        leftleg.mirror = true;
        leftleg.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg.addBox(0.0F, 12.0F, -2.0F, 4, 12, 4, 0.1F);
        leftleg_10 = new ModelRenderer(this, 61, 45);
        leftleg_10.mirror = true;
        leftleg_10.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_10.addBox(2.4F, 20.3F, -2.55F, 1, 2, 2, -0.35F);
        body_7 = new ModelRenderer(this, 61, 45);
        body_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_7.addBox(-2.0F, -1.5F, -2.81F, 1, 6, 4, -0.45F);
        setRotateAngle(body_7, 0.0F, 0.0F, -0.27314402793711257F);
      
        body_34 = new ModelRenderer(this, 61, 46);
        body_34.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_34.addBox(4.55F, 1.5F, -2.55F, 1, 1, 4, -0.2F);
        setRotateAngle(body_34, 0.0F, 0.0F, 0.8651597102135892F);
     
        rightleg_17 = new ModelRenderer(this, 63, 61);
        rightleg_17.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_17.addBox(-4.0F, 18.0F, 1.0F, 4, 4, 1, 0.2F);
        rightleg_3 = new ModelRenderer(this, 61, 46);
        rightleg_3.mirror = true;
        rightleg_3.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_3.addBox(-3.6F, 15.5F, -2.5F, 1, 3, 4, -0.1F);
        setRotateAngle(rightleg_3, 0.0F, 0.0F, -0.045553093477052F);
        bipedBody = new ModelRenderer(this, 16, 16);
        bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
    
        leftarm_1 = new ModelRenderer(this, 23, 45);
        leftarm_1.mirror = true;
        leftarm_1.setRotationPoint(-5.0F, -2.0F, 0.0F);
        leftarm_1.addBox(4.0F, 0.0F, -2.0F, 4, 3, 4, 0.2F);
        body_21 = new ModelRenderer(this, 90, 61);
        body_21.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_21.addBox(4.3F, 5.6F, -2.43F, 1, 5, 4, 0.0F);
        setRotateAngle(body_21, 0.0F, 0.0F, 0.6829473363053812F);
        rightarm_8 = new ModelRenderer(this, 21, 39);
        rightarm_8.setRotationPoint(5.0F, -2.0F, 0.0F);
        rightarm_8.addBox(-4.9F, 8.2F, -0.01F, 3, 1, 2, 0.2F);
        setRotateAngle(rightarm_8, 0.0F, 0.0F, 0.27314402793711257F);
        leftleg_18 = new ModelRenderer(this, 65, 58);
        leftleg_18.mirror = true;
        leftleg_18.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_18.addBox(0.0F, 18.0F, 6.0F, 4, 3, 1, 0.2F);
        setRotateAngle(leftleg_18, -0.27314402793711257F, 0.0F, 0.0F);
        leftarm_6 = new ModelRenderer(this, 45, 49);
        leftarm_6.mirror = true;
        leftarm_6.setRotationPoint(-5.0F, -2.0F, 0.0F);
        leftarm_6.addBox(6.6F, 5.0F, -0.5F, 3, 4, 1, -0.2F);
        body_44 = new ModelRenderer(this, 61, 50);
        body_44.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_44.addBox(-3.5F, 2.1F, 1.2F, 1, 4, 1, 0.2F);
        leftleg_17 = new ModelRenderer(this, 63, 61);
        leftleg_17.mirror = true;
        leftleg_17.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_17.addBox(0.0F, 18.0F, 1.0F, 4, 4, 1, 0.2F);
        body_47 = new ModelRenderer(this, 64, 50);
        body_47.mirror = true;
        body_47.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_47.addBox(1.3F, 8.7F, 1.0F, 1, 2, 1, 0.2F);
      
        body_18 = new ModelRenderer(this, 61, 46);
        body_18.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_18.addBox(4.8F, 1.9F, -2.4F, 1, 6, 4, 0.0F);
        setRotateAngle(body_18, 0.0F, 0.0F, 0.4553564018453205F);
       
        body = new ModelRenderer(this, 61, 17);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.1F);
     
        body_32 = new ModelRenderer(this, 61, 46);
        body_32.mirror = true;
        body_32.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_32.addBox(-1.9F, 3.8F, -2.55F, 1, 2, 4, -0.2F);
       
        body_25 = new ModelRenderer(this, 61, 46);
        body_25.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_25.addBox(3.0F, 8.8F, -2.45F, 1, 1, 4, 0.0F);
        rightleg_18 = new ModelRenderer(this, 65, 58);
        rightleg_18.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_18.addBox(-4.0F, 18.0F, 6.0F, 4, 3, 1, 0.2F);
        setRotateAngle(rightleg_18, -0.27314402793711257F, 0.0F, 0.0F);
        body_30 = new ModelRenderer(this, 61, 46);
        body_30.mirror = true;
        body_30.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_30.addBox(-4.1F, 4.2F, -2.35F, 3, 1, 4, 0.0F);
        rightleg_2 = new ModelRenderer(this, 61, 47);
        rightleg_2.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_2.addBox(-1.5F, 14.9F, -2.65F, 1, 5, 4, -0.45F);
       
        rightleg_13 = new ModelRenderer(this, 61, 45);
        rightleg_13.mirror = true;
        rightleg_13.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_13.addBox(18.2F, 7.5F, -2.55F, 1, 2, 2, -0.35F);
        setRotateAngle(rightleg_13, 0.0F, 0.0F, 1.1838568316277536F);
        leftarm_2 = new ModelRenderer(this, 66, 38);
        leftarm_2.mirror = true;
        leftarm_2.setRotationPoint(-3.0F, -2.0F, 0.0F);
        leftarm_2.addBox(2.0F, -0.2F, -2.0F, 2, 1, 4, 0.22F);
        leftarm = new ModelRenderer(this, 88, 16);
        leftarm.mirror = true;
        leftarm.setRotationPoint(-5.0F, -2.0F, 0.0F);
        leftarm.addBox(4.0F, 0.0F, -2.0F, 4, 11, 4, 0.1F);
        rightarm_1 = new ModelRenderer(this, 23, 45);
        rightarm_1.setRotationPoint(5.0F, -2.0F, 0.0F);
        rightarm_1.addBox(-8.0F, 0.0F, -2.0F, 4, 3, 4, 0.2F);
        rightleg_11 = new ModelRenderer(this, 63, 60);
        rightleg_11.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_11.addBox(-4.0F, 22.0F, -2.01F, 4, 2, 4, 0.2F);
        body_31 = new ModelRenderer(this, 61, 46);
        body_31.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_31.addBox(0.9F, 3.8F, -2.55F, 1, 2, 4, -0.2F);
        body_43 = new ModelRenderer(this, 62, 50);
        body_43.mirror = true;
        body_43.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_43.addBox(2.5F, 2.1F, 1.2F, 1, 4, 1, 0.2F);
        rightleg_1 = new ModelRenderer(this, 61, 45);
        rightleg_1.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_1.addBox(-12.9F, 4.8F, -2.65F, 1, 5, 4, -0.45F);
        setRotateAngle(rightleg_1, 0.0F, 0.0F, -0.8651597102135892F);
        body_40 = new ModelRenderer(this, 64, 50);
        body_40.mirror = true;
        body_40.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_40.addBox(-0.5F, 2.1F, 1.2F, 1, 5, 1, 0.2F);
        body_10 = new ModelRenderer(this, 61, 45);
        body_10.mirror = true;
        body_10.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_10.addBox(0.19999999999999996F, -1.3F, -2.81F, 1, 6, 4, -0.45F);
        setRotateAngle(body_10, 0.0F, 0.0F, 0.136659280431156F);
        leftleg_6 = new ModelRenderer(this, 61, 45);
        leftleg_6.mirror = true;
        leftleg_6.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_6.addBox(17.9F, 2.9F, -2.65F, 1, 5, 4, -0.45F);
        setRotateAngle(leftleg_6, 0.0F, 0.0F, 1.1838568316277536F);
        leftleg_2 = new ModelRenderer(this, 61, 47);
        leftleg_2.mirror = true;
        leftleg_2.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_2.addBox(0.5F, 15.0F, -2.65F, 1, 5, 4, -0.45F);
        body_13 = new ModelRenderer(this, 61, 46);
        body_13.mirror = true;
        body_13.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_13.addBox(-3.0F, 0.3F, -2.05F, 0, 4, 4, 0.3F);
        setRotateAngle(body_13, 0.0F, 0.0F, 0.22759093446006054F);
        leftarm_4 = new ModelRenderer(this, 45, 36);
        leftarm_4.mirror = true;
        leftarm_4.setRotationPoint(-5.0F, -2.0F, 0.0F);
        leftarm_4.addBox(7.0F, 6.6F, -2.0F, 1, 1, 4, 0.2F);
        leftleg_8 = new ModelRenderer(this, 61, 45);
        leftleg_8.mirror = true;
        leftleg_8.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_8.addBox(18.4F, 3.4F, -2.65F, 2, 2, 2, -0.45F);
        setRotateAngle(leftleg_8, 0.0F, 0.0F, 1.1838568316277536F);
     
        body_46 = new ModelRenderer(this, 60, 50);
        body_46.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_46.addBox(-9.8F, -1.6F, 1.0F, 1, 2, 1, 0.2F);
        setRotateAngle(body_46, 0.0F, 0.0F, -1.3203415791337103F);
        rightleg_8 = new ModelRenderer(this, 61, 45);
        rightleg_8.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_8.addBox(-20.4F, 3.4F, -2.65F, 2, 2, 2, -0.45F);
        setRotateAngle(rightleg_8, 0.0F, 0.0F, -1.1838568316277536F);
     
        leftleg_16 = new ModelRenderer(this, 61, 46);
        leftleg_16.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_16.addBox(2.6F, 15.5F, 1.5F, 1, 3, 1, -0.1F);
        setRotateAngle(leftleg_16, 0.0F, 0.0F, 0.045553093477052F);
        body_23 = new ModelRenderer(this, 61, 46);
        body_23.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_23.addBox(3.2F, 8.8F, -2.45F, 1, 2, 4, 0.0F);
        setRotateAngle(body_23, 0.0F, 0.0F, 0.091106186954104F);
        body_24 = new ModelRenderer(this, 61, 46);
        body_24.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_24.addBox(2.4F, 8.8F, -2.45F, 1, 1, 4, 0.0F);
        rightleg_4 = new ModelRenderer(this, 61, 46);
        rightleg_4.mirror = true;
        rightleg_4.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_4.addBox(-14.2F, 6.8F, -2.5F, 1, 2, 4, -0.1F);
        setRotateAngle(rightleg_4, 0.0F, 0.0F, -0.8651597102135892F);
      
        body_27 = new ModelRenderer(this, 61, 46);
        body_27.mirror = true;
        body_27.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_27.addBox(-3.4F, 8.8F, -2.45F, 1, 1, 4, 0.0F);
        leftleg_5 = new ModelRenderer(this, 61, 46);
        leftleg_5.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_5.addBox(3.25F, 14.5F, -2.5F, 1, 1, 4, -0.1F);
        leftleg_12 = new ModelRenderer(this, 61, 45);
        leftleg_12.mirror = true;
        leftleg_12.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_12.addBox(0.8999999999999999F, 20.3F, -2.55F, 1, 2, 2, -0.35F);
      
        body_35 = new ModelRenderer(this, 61, 74);
        body_35.mirror = true;
        body_35.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_35.addBox(2.9F, 9.2F, -2.8F, 1, 3, 1, -0.1F);
        setRotateAngle(body_35, 0.0F, 0.0F, 0.36425021489121656F);
        rightleg = new ModelRenderer(this, 88, 36);
        rightleg.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg.addBox(-4.0F, 12.0F, -2.0F, 4, 12, 4, 0.1F);
        leftarm_5 = new ModelRenderer(this, 21, 37);
        leftarm_5.mirror = true;
        leftarm_5.setRotationPoint(-5.0F, -2.0F, 0.0F);
        leftarm_5.addBox(1.9F, 8.2F, -1.95F, 3, 1, 2, 0.2F);
        setRotateAngle(leftarm_5, 0.0F, 0.0F, -0.27314402793711257F);
        body_5 = new ModelRenderer(this, 61, 45);
        body_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_5.addBox(-0.6F, 3.6F, -2.65F, 1, 8, 4, -0.45F);
        body_33 = new ModelRenderer(this, 61, 46);
        body_33.mirror = true;
        body_33.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_33.addBox(-5.55F, 1.5F, -2.55F, 1, 1, 4, -0.2F);
        setRotateAngle(body_33, 0.0F, 0.0F, -0.8651597102135892F);
        rightarm_5 = new ModelRenderer(this, 21, 37);
        rightarm_5.setRotationPoint(5.0F, -2.0F, 0.0F);
        rightarm_5.addBox(-4.9F, 8.2F, -1.99F, 3, 1, 2, 0.2F);
        setRotateAngle(rightarm_5, 0.0F, 0.0F, 0.27314402793711257F);
        
        body_9 = new ModelRenderer(this, 61, 45);
        body_9.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_9.addBox(-1.2F, -1.3F, -2.81F, 1, 6, 4, -0.45F);
        setRotateAngle(body_9, 0.0F, 0.0F, -0.136659280431156F);
        
        body_16 = new ModelRenderer(this, 61, 46);
        body_16.mirror = true;
        body_16.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_16.addBox(-3.6F, 0.2F, -2.05F, 0, 2, 4, 0.3F);
        setRotateAngle(body_16, 0.0F, 0.0F, 0.22759093446006054F);
       
        body_19 = new ModelRenderer(this, 61, 46);
        body_19.mirror = true;
        body_19.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_19.addBox(-0.1F, 9.2F, -2.4F, 1, 2, 4, 0.0F);
        setRotateAngle(body_19, 0.0F, 0.0F, 0.18203784098300857F);
        leftleg_9 = new ModelRenderer(this, 61, 45);
        leftleg_9.mirror = true;
        leftleg_9.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_9.addBox(19.8F, 3.6F, -2.55F, 1, 2, 2, -0.35F);
        setRotateAngle(leftleg_9, 0.0F, 0.0F, 1.1838568316277536F);
        body_41 = new ModelRenderer(this, 60, 50);
        body_41.mirror = true;
        body_41.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_41.addBox(6.0F, 0.4F, 1.0F, 1, 2, 1, 0.2F);
        setRotateAngle(body_41, 0.0F, 0.0F, 1.0016444577195458F);
        rightleg_15 = new ModelRenderer(this, 61, 46);
        rightleg_15.mirror = true;
        rightleg_15.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_15.addBox(-14.2F, 6.8F, 1.5F, 1, 2, 1, -0.1F);
        setRotateAngle(rightleg_15, 0.0F, 0.0F, -0.8651597102135892F);
      
        body_26 = new ModelRenderer(this, 61, 46);
        body_26.mirror = true;
        body_26.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_26.addBox(-4.2F, 8.8F, -2.45F, 1, 2, 4, 0.0F);
        setRotateAngle(body_26, 0.0F, 0.0F, -0.091106186954104F);
        body_22 = new ModelRenderer(this, 90, 61);
        body_22.mirror = true;
        body_22.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_22.addBox(-5.3F, 5.6F, -2.43F, 1, 5, 4, 0.0F);
        setRotateAngle(body_22, 0.0F, 0.0F, -0.6829473363053812F);
        body_38 = new ModelRenderer(this, 61, 74);
        body_38.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_38.addBox(-10.0F, 7.56F, -2.85F, 1, 1, 4, -0.15F);
        setRotateAngle(body_38, 0.0F, 0.0F, -0.7853981633974483F);
        rightarm_3 = new ModelRenderer(this, 45, 36);
        rightarm_3.setRotationPoint(5.0F, -2.0F, 0.0F);
        rightarm_3.addBox(-8.0F, 7.5F, -2.0F, 4, 3, 4, 0.2F);
        leftarm_8 = new ModelRenderer(this, 21, 39);
        leftarm_8.mirror = true;
        leftarm_8.setRotationPoint(-5.0F, -2.0F, 0.0F);
        leftarm_8.addBox(1.9F, 8.2F, -0.01F, 3, 1, 2, 0.2F);
        setRotateAngle(leftarm_8, 0.0F, 0.0F, -0.27314402793711257F);
      
        leftleg_13 = new ModelRenderer(this, 61, 45);
        leftleg_13.setRotationPoint(-2.0F, -12.0F, 0.0F);
        leftleg_13.addBox(-19.2F, 7.5F, -2.55F, 1, 2, 2, -0.35F);
        setRotateAngle(leftleg_13, 0.0F, 0.0F, -1.1838568316277536F);
        body_45 = new ModelRenderer(this, 60, 50);
        body_45.mirror = true;
        body_45.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_45.addBox(8.8F, -1.6F, 1.0F, 1, 2, 1, 0.2F);
        setRotateAngle(body_45, 0.0F, 0.0F, 1.3203415791337103F);
        body_39 = new ModelRenderer(this, 61, 74);
        body_39.mirror = true;
        body_39.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_39.addBox(9.0F, 7.56F, -2.85F, 1, 1, 4, -0.15F);
        setRotateAngle(body_39, 0.0F, 0.0F, 0.7853981633974483F);
        body_15 = new ModelRenderer(this, 61, 46);
        body_15.mirror = true;
        body_15.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_15.addBox(-4.0F, 0.0F, -2.3F, 0, 4, 4, 0.31F);
        
      
        body_4 = new ModelRenderer(this, 61, 45);
        body_4.mirror = true;
        body_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_4.addBox(-0.2F, 3.6F, -2.65F, 1, 8, 4, -0.45F);
        body_8 = new ModelRenderer(this, 61, 45);
        body_8.mirror = true;
        body_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_8.addBox(1.0F, -1.5F, -2.81F, 1, 6, 4, -0.45F);
        setRotateAngle(body_8, 0.0F, 0.0F, 0.27314402793711257F);
        bipedHead = new ModelRenderer(this, 0, 0);
        bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        body_28 = new ModelRenderer(this, 61, 46);
        body_28.mirror = true;
        body_28.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_28.addBox(-4.0F, 8.8F, -2.45F, 1, 1, 4, 0.0F);
        rightleg_12 = new ModelRenderer(this, 61, 45);
        rightleg_12.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_12.addBox(-1.9F, 20.3F, -2.55F, 1, 2, 2, -0.35F);
        leftarm_3 = new ModelRenderer(this, 45, 36);
        leftarm_3.mirror = true;
        leftarm_3.setRotationPoint(-5.0F, -2.0F, 0.0F);
        leftarm_3.addBox(4.0F, 7.5F, -2.0F, 4, 3, 4, 0.2F);
        leftarm_7 = new ModelRenderer(this, 45, 49);
        leftarm_7.mirror = true;
        leftarm_7.setRotationPoint(-5.0F, -2.0F, 0.0F);
        leftarm_7.addBox(10.0F, 0.7F, -0.5F, 3, 3, 1, -0.2F);
        setRotateAngle(leftarm_7, 0.0F, 0.0F, 0.6829473363053812F);
        rightleg_7 = new ModelRenderer(this, 61, 45);
        rightleg_7.setRotationPoint(2.0F, -12.0F, 0.0F);
        rightleg_7.addBox(-19.3F, 2.9F, -2.65F, 1, 5, 2, -0.45F);
        setRotateAngle(rightleg_7, 0.0F, 0.0F, -1.1838568316277536F);
      
        body_6 = new ModelRenderer(this, 61, 45);
        body_6.mirror = true;
        body_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_6.addBox(-0.4F, 3.6F, -2.65F, 1, 8, 4, -0.45F);
        body_37 = new ModelRenderer(this, 61, 74);
        body_37.setRotationPoint(0.0F, 0.0F, 0.0F);
        body_37.addBox(-7.4F, 6.4F, -2.85F, 1, 1, 4, -0.15F);
        setRotateAngle(body_37, 0.0F, 0.0F, -0.7853981633974483F);
        
     
        
        bipedBody.addChild(body);
        bipedBody.addChild(body_1);
        bipedBody.addChild(body_2);
        bipedBody.addChild(body_3);
        bipedBody.addChild(body_4);
        bipedBody.addChild(body_5);
        bipedBody.addChild(body_6);
        bipedBody.addChild(body_7);
        bipedBody.addChild(body_8);
        bipedBody.addChild(body_9);
        bipedBody.addChild(body_10);
        bipedBody.addChild(body_11);
        bipedBody.addChild(body_12);
        bipedBody.addChild(body_13);
        bipedBody.addChild(body_14);
        bipedBody.addChild(body_15);
        bipedBody.addChild(body_16);
        bipedBody.addChild(body_17);
        bipedBody.addChild(body_18);
        bipedBody.addChild(body_19);
        bipedBody.addChild(body_20);
        bipedBody.addChild(body_21);
        bipedBody.addChild(body_22);
        bipedBody.addChild(body_23);
        bipedBody.addChild(body_24);
        bipedBody.addChild(body_25);
        bipedBody.addChild(body_26);
        bipedBody.addChild(body_27);
        bipedBody.addChild(body_28);
        bipedBody.addChild(body_29);
        bipedBody.addChild(body_30);
        bipedBody.addChild(body_31);
        bipedBody.addChild(body_32);
        bipedBody.addChild(body_33);
        bipedBody.addChild(body_34);
        bipedBody.addChild(body_35);
        bipedBody.addChild(body_36);
        bipedBody.addChild(body_37);
        bipedBody.addChild(body_38);
        bipedBody.addChild(body_39);
        bipedBody.addChild(body_40);
        bipedBody.addChild(body_41);
        bipedBody.addChild(body_42);
        bipedBody.addChild(body_43);
        bipedBody.addChild(body_44);
        bipedBody.addChild(body_45);
        bipedBody.addChild(body_46);
        bipedBody.addChild(body_47);
        bipedBody.addChild(body_48);

        
        bipedLeftArm.addChild(leftarm);
        bipedLeftArm.addChild(leftarm_1);
        bipedLeftArm.addChild(leftarm_2);
        bipedLeftArm.addChild(leftarm_3);
        bipedLeftArm.addChild(leftarm_4);
        bipedLeftArm.addChild(leftarm_5);
        bipedLeftArm.addChild(leftarm_6);
        bipedLeftArm.addChild(leftarm_7);
        bipedLeftArm.addChild(leftarm_8);
        
        bipedRightArm.addChild(rightarm);
        bipedRightArm.addChild(rightarm_1);
        bipedRightArm.addChild(rightarm_2);
        bipedRightArm.addChild(rightarm_3);
        bipedRightArm.addChild(rightarm_4);
        bipedRightArm.addChild(rightarm_5);
        bipedRightArm.addChild(rightarm_6);
        bipedRightArm.addChild(rightarm_7);
        bipedRightArm.addChild(rightarm_8);


        bipedLeftLeg.addChild(leftleg);
        bipedLeftLeg.addChild(leftleg_1);
        bipedLeftLeg.addChild(leftleg_2);
        bipedLeftLeg.addChild(leftleg_3);
        bipedLeftLeg.addChild(leftleg_4);
        bipedLeftLeg.addChild(leftleg_5);
        bipedLeftLeg.addChild(leftleg_6);
        bipedLeftLeg.addChild(leftleg_7);
        bipedLeftLeg.addChild(leftleg_8);
        bipedLeftLeg.addChild(leftleg_9);
        bipedLeftLeg.addChild(leftleg_10);
        bipedLeftLeg.addChild(leftleg_11);
        bipedLeftLeg.addChild(leftleg_12);
        bipedLeftLeg.addChild(leftleg_13);
        bipedLeftLeg.addChild(leftleg_14);
        bipedLeftLeg.addChild(leftleg_15);
        bipedLeftLeg.addChild(leftleg_16);
        bipedLeftLeg.addChild(leftleg_17);
        bipedLeftLeg.addChild(leftleg_18);

        

        
        bipedRightLeg.addChild(rightleg);
        bipedRightLeg.addChild(rightleg_1);
        bipedRightLeg.addChild(rightleg_2);
        bipedRightLeg.addChild(rightleg_3);
        bipedRightLeg.addChild(rightleg_4);
        bipedRightLeg.addChild(rightleg_5);
        bipedRightLeg.addChild(rightleg_6);
        bipedRightLeg.addChild(rightleg_7);
        bipedRightLeg.addChild(rightleg_8);
        bipedRightLeg.addChild(rightleg_9);
        bipedRightLeg.addChild(rightleg_10);
        bipedRightLeg.addChild(rightleg_11);
        bipedRightLeg.addChild(rightleg_12);
        bipedRightLeg.addChild(rightleg_13);
        bipedRightLeg.addChild(rightleg_14);
        bipedRightLeg.addChild(rightleg_15);
        bipedRightLeg.addChild(rightleg_16);
        bipedRightLeg.addChild(rightleg_17);
        bipedRightLeg.addChild(rightleg_18);

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
    	super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
       
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
