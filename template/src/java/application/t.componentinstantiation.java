T_b("        ");
T_b("components[");
T_b(T_s(RSL_ComponentInstantiation_MDA_index(((RSL_ComponentInstantiation *)xtUML_detect_empty_handle(self,"ComponentInstantiation","self.index")))));
T_b("] = new ");
T_b(self->comp_name);
T_b("( executors[");
T_b(T_s(self->executor_index));
T_b("] );");
T_b("\n");