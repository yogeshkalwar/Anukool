using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Anukool.RNAnukool
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNAnukoolModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNAnukoolModule"/>.
        /// </summary>
        internal RNAnukoolModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNAnukool";
            }
        }
    }
}
