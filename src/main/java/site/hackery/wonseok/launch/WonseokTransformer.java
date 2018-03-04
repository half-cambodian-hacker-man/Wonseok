package site.hackery.wonseok.launch;

import net.minecraft.launchwrapper.IClassTransformer;
import site.hackery.wonseok.patch.GuiTextFieldPatcher;

public class WonseokTransformer implements IClassTransformer {

    // TODO: SRG, MCP mappings.

    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        if (GuiTextFieldPatcher.classMatches(name)) {
            return new GuiTextFieldPatcher().patchClass(name, basicClass);
        }

        return basicClass;
    }
}
