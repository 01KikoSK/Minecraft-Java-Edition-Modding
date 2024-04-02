public class SporeCreature extends EntityLiving {

    public SporeCreature(World world) {
        super(world);
    }

    @Override
    protected void initEntityAttributes() {
        super.initEntityAttributes();
        this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.3D);
    }

    // Implement behaviors, attacks, rendering, etc.
}
