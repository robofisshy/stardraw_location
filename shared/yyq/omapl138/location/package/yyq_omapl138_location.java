/*
 *  Do not modify this file; it is automatically 
 *  generated and any modifications will be overwritten.
 *
 * @(#) xdc-z52
 */
import java.util.*;
import org.mozilla.javascript.*;
import xdc.services.intern.xsr.*;
import xdc.services.spec.Session;

public class yyq_omapl138_location
{
    static final String VERS = "@(#) xdc-z52\n";

    static final Proto.Elm $$T_Bool = Proto.Elm.newBool();
    static final Proto.Elm $$T_Num = Proto.Elm.newNum();
    static final Proto.Elm $$T_Str = Proto.Elm.newStr();
    static final Proto.Elm $$T_Obj = Proto.Elm.newObj();

    static final Proto.Fxn $$T_Met = new Proto.Fxn(null, null, 0, -1, false);
    static final Proto.Map $$T_Map = new Proto.Map($$T_Obj);
    static final Proto.Arr $$T_Vec = new Proto.Arr($$T_Obj);

    static final XScriptO $$DEFAULT = Value.DEFAULT;
    static final Object $$UNDEF = Undefined.instance;

    static final Proto.Obj $$Package = (Proto.Obj)Global.get("$$Package");
    static final Proto.Obj $$Module = (Proto.Obj)Global.get("$$Module");
    static final Proto.Obj $$Instance = (Proto.Obj)Global.get("$$Instance");
    static final Proto.Obj $$Params = (Proto.Obj)Global.get("$$Params");

    static final Object $$objFldGet = Global.get("$$objFldGet");
    static final Object $$objFldSet = Global.get("$$objFldSet");
    static final Object $$proxyGet = Global.get("$$proxyGet");
    static final Object $$proxySet = Global.get("$$proxySet");
    static final Object $$delegGet = Global.get("$$delegGet");
    static final Object $$delegSet = Global.get("$$delegSet");

    Scriptable xdcO;
    Session ses;
    Value.Obj om;

    boolean isROV;
    boolean isCFG;

    Proto.Obj pkgP;
    Value.Obj pkgV;

    ArrayList<Object> imports = new ArrayList<Object>();
    ArrayList<Object> loggables = new ArrayList<Object>();
    ArrayList<Object> mcfgs = new ArrayList<Object>();
    ArrayList<Object> icfgs = new ArrayList<Object>();
    ArrayList<String> inherits = new ArrayList<String>();
    ArrayList<Object> proxies = new ArrayList<Object>();
    ArrayList<Object> sizes = new ArrayList<Object>();
    ArrayList<Object> tdefs = new ArrayList<Object>();

    void $$IMPORTS()
    {
        Global.callFxn("loadPackage", xdcO, "xdc");
        Global.callFxn("loadPackage", xdcO, "xdc.corevers");
        Global.callFxn("loadPackage", xdcO, "xdc.platform");
        Global.callFxn("loadPackage", xdcO, "ti.platforms.generic");
    }

    void $$OBJECTS()
    {
        pkgP = (Proto.Obj)om.bind("yyq.omapl138.location.Package", new Proto.Obj());
        pkgV = (Value.Obj)om.bind("yyq.omapl138.location", new Value.Obj("yyq.omapl138.location", pkgP));
    }

    void Platform$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("yyq.omapl138.location.Platform.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("yyq.omapl138.location.Platform", new Value.Obj("yyq.omapl138.location.Platform", po));
        pkgV.bind("Platform", vo);
        // decls 
        om.bind("yyq.omapl138.location.Platform.Board", om.findStrict("xdc.platform.IPlatform.Board", "yyq.omapl138.location"));
        om.bind("yyq.omapl138.location.Platform.Memory", om.findStrict("xdc.platform.IPlatform.Memory", "yyq.omapl138.location"));
        // insts 
        Object insP = om.bind("yyq.omapl138.location.Platform.Instance", new Proto.Obj());
        po = (Proto.Obj)om.bind("yyq.omapl138.location.Platform$$Object", new Proto.Obj());
        Object objP = om.bind("yyq.omapl138.location.Platform.Object", new Proto.Str(po, true));
        po = (Proto.Obj)om.bind("yyq.omapl138.location.Platform$$Params", new Proto.Obj());
        om.bind("yyq.omapl138.location.Platform.Params", new Proto.Str(po, true));
    }

    void Platform$$CONSTS()
    {
        // module Platform
    }

    void Platform$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

        fxn = (Proto.Fxn)om.bind("yyq.omapl138.location.Platform$$create", new Proto.Fxn(om.findStrict("yyq.omapl138.location.Platform.Module", "yyq.omapl138.location"), om.findStrict("yyq.omapl138.location.Platform.Instance", "yyq.omapl138.location"), 2, 1, false));
                fxn.addArg(0, "name", $$T_Str, $$UNDEF);
                fxn.addArg(1, "__params", (Proto)om.findStrict("yyq.omapl138.location.Platform.Params", "yyq.omapl138.location"), Global.newObject());
        sb = new StringBuilder();
        sb.append("yyq$omapl138$location$Platform$$create = function( name, __params ) {\n");
            sb.append("var __mod = xdc.om['yyq.omapl138.location.Platform'];\n");
            sb.append("var __inst = xdc.om['yyq.omapl138.location.Platform.Instance'].$$make();\n");
            sb.append("__inst.$$bind('$package', xdc.om['yyq.omapl138.location']);\n");
            sb.append("__inst.$$bind('$index', __mod.$instances.length);\n");
            sb.append("__inst.$$bind('$category', 'Instance');\n");
            sb.append("__inst.$$bind('$args', {name:name});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$instances.$add(__inst);\n");
            sb.append("__inst.externalMemoryMap = __mod.PARAMS.externalMemoryMap;\n");
            sb.append("__inst.customMemoryMap = __mod.PARAMS.customMemoryMap;\n");
            sb.append("__inst.renameMap = __mod.PARAMS.renameMap;\n");
            sb.append("__inst.dataMemory = __mod.PARAMS.dataMemory;\n");
            sb.append("__inst.codeMemory = __mod.PARAMS.codeMemory;\n");
            sb.append("__inst.stackMemory = __mod.PARAMS.stackMemory;\n");
            sb.append("__inst.sectMap = __mod.PARAMS.sectMap;\n");
            sb.append("__inst.peripherals = __mod.PARAMS.peripherals;\n");
            sb.append("for (var __p in __params) __inst[__p] = __params[__p];\n");
            sb.append("var save = xdc.om.$curpkg;\n");
            sb.append("xdc.om.$$bind('$curpkg', __mod.$package.$name);\n");
            sb.append("__mod.instance$meta$init.$fxn.apply(__inst, [name]);\n");
            sb.append("xdc.om.$$bind('$curpkg', save);\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return __inst;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
        fxn = (Proto.Fxn)om.bind("yyq.omapl138.location.Platform$$construct", new Proto.Fxn(om.findStrict("yyq.omapl138.location.Platform.Module", "yyq.omapl138.location"), null, 3, 1, false));
                fxn.addArg(0, "__obj", (Proto)om.findStrict("yyq.omapl138.location.Platform$$Object", "yyq.omapl138.location"), null);
                fxn.addArg(1, "name", $$T_Str, $$UNDEF);
                fxn.addArg(2, "__params", (Proto)om.findStrict("yyq.omapl138.location.Platform.Params", "yyq.omapl138.location"), Global.newObject());
        sb = new StringBuilder();
        sb.append("yyq$omapl138$location$Platform$$construct = function( __obj, name, __params ) {\n");
            sb.append("var __mod = xdc.om['yyq.omapl138.location.Platform'];\n");
            sb.append("var __inst = __obj;\n");
            sb.append("__inst.$$bind('$args', {name:name});\n");
            sb.append("__inst.$$bind('$module', __mod);\n");
            sb.append("__mod.$objects.$add(__inst);\n");
            sb.append("__inst.externalMemoryMap = __mod.PARAMS.externalMemoryMap;\n");
            sb.append("__inst.customMemoryMap = __mod.PARAMS.customMemoryMap;\n");
            sb.append("__inst.renameMap = __mod.PARAMS.renameMap;\n");
            sb.append("__inst.dataMemory = __mod.PARAMS.dataMemory;\n");
            sb.append("__inst.codeMemory = __mod.PARAMS.codeMemory;\n");
            sb.append("__inst.stackMemory = __mod.PARAMS.stackMemory;\n");
            sb.append("__inst.sectMap = __mod.PARAMS.sectMap;\n");
            sb.append("__inst.peripherals = __mod.PARAMS.peripherals;\n");
            sb.append("for (var __p in __params) __inst[__p] = __params[__p];\n");
            sb.append("__inst.$$bless();\n");
            sb.append("return null;\n");
        sb.append("}\n");
        Global.eval(sb.toString());
    }

    void Platform$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void Platform$$SIZES()
    {
    }

    void Platform$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "yyq/omapl138/location/Platform.xs");
        om.bind("yyq.omapl138.location.Platform$$capsule", cap);
        po = (Proto.Obj)om.findStrict("yyq.omapl138.location.Platform.Module", "yyq.omapl138.location");
        po.init("yyq.omapl138.location.Platform.Module", om.findStrict("xdc.platform.IPlatform.Module", "yyq.omapl138.location"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("CPU", (Proto)om.findStrict("ti.platforms.generic.Platform.Instance", "yyq.omapl138.location"), $$UNDEF, "wh");
                po.addFxn("create", (Proto.Fxn)om.findStrict("yyq.omapl138.location.Platform$$create", "yyq.omapl138.location"), Global.get("yyq$omapl138$location$Platform$$create"));
                po.addFxn("construct", (Proto.Fxn)om.findStrict("yyq.omapl138.location.Platform$$construct", "yyq.omapl138.location"), Global.get("yyq$omapl138$location$Platform$$construct"));
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("yyq.omapl138.location.Platform$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("yyq.omapl138.location.Platform$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "instance$meta$init");
        if (fxn != null) om.bind("yyq.omapl138.location.Platform$$instance$meta$init", true);
        if (fxn != null) po.addFxn("instance$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("yyq.omapl138.location.Platform$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
        po = (Proto.Obj)om.findStrict("yyq.omapl138.location.Platform.Instance", "yyq.omapl138.location");
        po.init("yyq.omapl138.location.Platform.Instance", om.findStrict("xdc.platform.IPlatform.Instance", "yyq.omapl138.location"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("codeMemory", $$T_Str, "DSP_PROG", "wh");
        po.addFld("dataMemory", $$T_Str, "DSP_PROG", "wh");
        po.addFld("stackMemory", $$T_Str, "DSP_PROG", "wh");
        po.addFld("l2Mode", $$T_Str, "32k", "wh");
        po.addFld("l1PMode", $$T_Str, "32k", "wh");
        po.addFld("l1DMode", $$T_Str, "32k", "wh");
                fxn = Global.get(cap, "getCpuDataSheet");
                if (fxn != null) po.addFxn("getCpuDataSheet", (Proto.Fxn)om.findStrict("xdc.platform.IPlatform$$getCpuDataSheet", "yyq.omapl138.location"), fxn);
                fxn = Global.get(cap, "getCreateArgs");
                if (fxn != null) po.addFxn("getCreateArgs", (Proto.Fxn)om.findStrict("xdc.platform.IPlatform$$getCreateArgs", "yyq.omapl138.location"), fxn);
                fxn = Global.get(cap, "getExeContext");
                if (fxn != null) po.addFxn("getExeContext", (Proto.Fxn)om.findStrict("xdc.platform.IPlatform$$getExeContext", "yyq.omapl138.location"), fxn);
                fxn = Global.get(cap, "getExecCmd");
                if (fxn != null) po.addFxn("getExecCmd", (Proto.Fxn)om.findStrict("xdc.platform.IPlatform$$getExecCmd", "yyq.omapl138.location"), fxn);
                fxn = Global.get(cap, "getLinkTemplate");
                if (fxn != null) po.addFxn("getLinkTemplate", (Proto.Fxn)om.findStrict("xdc.platform.IPlatform$$getLinkTemplate", "yyq.omapl138.location"), fxn);
        po = (Proto.Obj)om.findStrict("yyq.omapl138.location.Platform$$Params", "yyq.omapl138.location");
        po.init("yyq.omapl138.location.Platform.Params", om.findStrict("xdc.platform.IPlatform$$Params", "yyq.omapl138.location"));
                po.addFld("$hostonly", $$T_Num, 1, "r");
        po.addFld("codeMemory", $$T_Str, "DSP_PROG", "wh");
        po.addFld("dataMemory", $$T_Str, "DSP_PROG", "wh");
        po.addFld("stackMemory", $$T_Str, "DSP_PROG", "wh");
        po.addFld("l2Mode", $$T_Str, "32k", "wh");
        po.addFld("l1PMode", $$T_Str, "32k", "wh");
        po.addFld("l1DMode", $$T_Str, "32k", "wh");
        po = (Proto.Obj)om.findStrict("yyq.omapl138.location.Platform$$Object", "yyq.omapl138.location");
        po.init("yyq.omapl138.location.Platform.Object", om.findStrict("yyq.omapl138.location.Platform.Instance", "yyq.omapl138.location"));
                fxn = Global.get(cap, "getCpuDataSheet");
                if (fxn != null) po.addFxn("getCpuDataSheet", (Proto.Fxn)om.findStrict("xdc.platform.IPlatform$$getCpuDataSheet", "yyq.omapl138.location"), fxn);
                fxn = Global.get(cap, "getCreateArgs");
                if (fxn != null) po.addFxn("getCreateArgs", (Proto.Fxn)om.findStrict("xdc.platform.IPlatform$$getCreateArgs", "yyq.omapl138.location"), fxn);
                fxn = Global.get(cap, "getExeContext");
                if (fxn != null) po.addFxn("getExeContext", (Proto.Fxn)om.findStrict("xdc.platform.IPlatform$$getExeContext", "yyq.omapl138.location"), fxn);
                fxn = Global.get(cap, "getExecCmd");
                if (fxn != null) po.addFxn("getExecCmd", (Proto.Fxn)om.findStrict("xdc.platform.IPlatform$$getExecCmd", "yyq.omapl138.location"), fxn);
                fxn = Global.get(cap, "getLinkTemplate");
                if (fxn != null) po.addFxn("getLinkTemplate", (Proto.Fxn)om.findStrict("xdc.platform.IPlatform$$getLinkTemplate", "yyq.omapl138.location"), fxn);
    }

    void Platform$$ROV()
    {
    }

    void $$SINGLETONS()
    {
        pkgP.init("yyq.omapl138.location.Package", (Proto.Obj)om.findStrict("xdc.IPackage.Module", "yyq.omapl138.location"));
        pkgP.bind("$capsule", $$UNDEF);
        pkgV.init2(pkgP, "yyq.omapl138.location", Value.DEFAULT, false);
        pkgV.bind("$name", "yyq.omapl138.location");
        pkgV.bind("$category", "Package");
        pkgV.bind("$$qn", "yyq.omapl138.location.");
        pkgV.bind("$vers", Global.newArray());
        Value.Map atmap = (Value.Map)pkgV.getv("$attr");
        atmap.seal("length");
        imports.clear();
        pkgV.bind("$imports", imports);
        StringBuilder sb = new StringBuilder();
        sb.append("var pkg = xdc.om['yyq.omapl138.location'];\n");
        sb.append("if (pkg.$vers.length >= 3) {\n");
            sb.append("pkg.$vers.push(Packages.xdc.services.global.Vers.getDate(xdc.csd() + '/..'));\n");
        sb.append("}\n");
        sb.append("pkg.build.libraries = [\n");
        sb.append("];\n");
        sb.append("pkg.build.libDesc = [\n");
        sb.append("];\n");
        Global.eval(sb.toString());
    }

    void Platform$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("yyq.omapl138.location.Platform", "yyq.omapl138.location");
        po = (Proto.Obj)om.findStrict("yyq.omapl138.location.Platform.Module", "yyq.omapl138.location");
        vo.init2(po, "yyq.omapl138.location.Platform", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("yyq.omapl138.location.Platform$$capsule", "yyq.omapl138.location"));
        vo.bind("Instance", om.findStrict("yyq.omapl138.location.Platform.Instance", "yyq.omapl138.location"));
        vo.bind("Params", om.findStrict("yyq.omapl138.location.Platform.Params", "yyq.omapl138.location"));
        vo.bind("PARAMS", ((Proto.Str)om.findStrict("yyq.omapl138.location.Platform.Params", "yyq.omapl138.location")).newInstance());
        vo.bind("$package", om.findStrict("yyq.omapl138.location", "yyq.omapl138.location"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        vo.bind("Board", om.findStrict("xdc.platform.IPlatform.Board", "yyq.omapl138.location"));
        tdefs.add(om.findStrict("xdc.platform.IPlatform.Board", "yyq.omapl138.location"));
        vo.bind("Memory", om.findStrict("xdc.platform.IPlatform.Memory", "yyq.omapl138.location"));
        tdefs.add(om.findStrict("xdc.platform.IPlatform.Memory", "yyq.omapl138.location"));
        vo.bind("MemoryMap", om.findStrict("xdc.platform.IPlatform.MemoryMap", "yyq.omapl138.location"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("xdc.platform");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "yyq.omapl138.location")).add(vo);
        vo.bind("$$instflag", 1);
        vo.bind("$$iobjflag", 1);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        Proto.Str ps = (Proto.Str)vo.find("Module_State");
        if (ps != null) vo.bind("$object", ps.newInstance());
        vo.bind("$$meta_iobj", om.has("yyq.omapl138.location.Platform$$instance$static$init", null) ? 1 : 0);
        vo.bind("$$fxntab", Global.newArray());
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("Object", om.findStrict("yyq.omapl138.location.Platform.Object", "yyq.omapl138.location"));
        pkgV.bind("Platform", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("Platform");
    }

    void $$INITIALIZATION()
    {
        Value.Obj vo;

        if (isCFG) {
        }//isCFG
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("yyq.omapl138.location.Platform", "yyq.omapl138.location"));
        vo = (Value.Obj)om.findStrict("yyq.omapl138.location.Platform", "yyq.omapl138.location");
        Global.put(vo, "CPU", Global.callFxn("create", (Scriptable)om.find("ti.platforms.generic.Platform"), "CPU", Global.newObject("clockRate", 300.0, "catalogName", "ti.catalog.c6000", "deviceName", "OMAPL138", "customMemoryMap", Global.newArray(new Object[]{Global.newArray(new Object[]{"SR_0", Global.newObject("name", "SR_0", "base", 0xC2000000L, "len", 0x10000L, "space", "data", "access", "RWX")}), Global.newArray(new Object[]{"SR_1", Global.newObject("name", "SR_1", "base", 0xC2010000L, "len", 0xf00000L, "space", "data", "access", "RWX")}), Global.newArray(new Object[]{"DSP_PROG", Global.newObject("name", "DSP_PROG", "base", 0xC3000000L, "len", 0xA00000L, "space", "code/data", "access", "RWX")})}), "l2Mode", "32k", "l1PMode", "32k", "l1DMode", "32k")));
        Global.callFxn("init", pkgV);
        ((Value.Obj)om.getv("yyq.omapl138.location.Platform")).bless();
        ((Value.Arr)om.findStrict("$packages", "yyq.omapl138.location")).add(pkgV);
    }

    public void exec( Scriptable xdcO, Session ses )
    {
        this.xdcO = xdcO;
        this.ses = ses;
        om = (Value.Obj)xdcO.get("om", null);

        Object o = om.geto("$name");
        String s = o instanceof String ? (String)o : null;
        isCFG = s != null && s.equals("cfg");
        isROV = s != null && s.equals("rov");

        $$IMPORTS();
        $$OBJECTS();
        Platform$$OBJECTS();
        Platform$$CONSTS();
        Platform$$CREATES();
        Platform$$FUNCTIONS();
        Platform$$SIZES();
        Platform$$TYPES();
        if (isROV) {
            Platform$$ROV();
        }//isROV
        $$SINGLETONS();
        Platform$$SINGLETONS();
        $$INITIALIZATION();
    }
}
