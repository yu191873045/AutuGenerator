package live.autu.generator.generator.ssm;

import com.jfinal.kit.Kv;

import live.autu.generator.core.TableMeta;
import live.autu.generator.generator.Generator;

public class ControllerGenerator extends Generator {

	{
		setTemplateDir("/live/autu/generator/generator/ssm/tpl/controller.tpl");
	}
	
	@Override
	protected String buildFileName(Kv data) {
		TableMeta TableMeta=data.getAs("tableMeta");
		return TableMeta.camelName+"Controller.java";
	}

}
