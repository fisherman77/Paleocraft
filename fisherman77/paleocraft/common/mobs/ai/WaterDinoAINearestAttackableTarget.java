package fisherman77.paleocraft.common.mobs.ai;

import java.util.Collections;
import java.util.List;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;

public class WaterDinoAINearestAttackableTarget extends WaterDinoAITarget
{
    private final Class targetClass;
    private final int targetChance;

    /** Instance of EntityAINearestAttackableTargetSorter. */
    private final WaterDinoAINearestAttackableTargetSorter theNearestAttackableTargetSorter;
    private final IEntitySelector field_82643_g;
    private EntityLivingBase targetEntity;

    public WaterDinoAINearestAttackableTarget(EntityCreature par1EntityCreature, Class par2Class, int par3, boolean par4)
    {
        this(par1EntityCreature, par2Class, par3, par4, false);
    }

    public WaterDinoAINearestAttackableTarget(EntityCreature par1EntityCreature, Class par2Class, int par3, boolean par4, boolean par5)
    {
        this(par1EntityCreature, par2Class, par3, par4, par5, (IEntitySelector)null);
    }

    public WaterDinoAINearestAttackableTarget(EntityCreature par1EntityCreature, Class par2Class, int par3, boolean par4, boolean par5, IEntitySelector par6IEntitySelector)
    {
        super(par1EntityCreature, par4, par5);
        this.targetClass = par2Class;
        this.targetChance = par3;
        this.theNearestAttackableTargetSorter = new WaterDinoAINearestAttackableTargetSorter(par1EntityCreature);
        this.setMutexBits(1);
        this.field_82643_g = new EntityAINearestAttackableTargetSelector(this, par6IEntitySelector);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (this.targetChance > 0 && this.taskOwner.getRNG().nextInt(this.targetChance) != 0)
        {
            return false;
        }
        else
        {
            double d0 = this.func_111175_f();
            List list = this.taskOwner.worldObj.selectEntitiesWithinAABB(this.targetClass, this.taskOwner.boundingBox.expand(d0, 4.0D, d0), this.field_82643_g);
            Collections.sort(list, this.theNearestAttackableTargetSorter);

            if (list.isEmpty())
            {
                return false;
            }
            else
            {
                this.targetEntity = (EntityLivingBase)list.get(0);
                return true;
            }
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.taskOwner.setAttackTarget(this.targetEntity);
        super.startExecuting();
    }
}
